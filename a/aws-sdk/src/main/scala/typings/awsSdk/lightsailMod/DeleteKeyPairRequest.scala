package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeyPairRequest extends StObject {
  
  /**
    * The RSA fingerprint of the Lightsail default key pair to delete.  The expectedFingerprint parameter is required only when specifying to delete a Lightsail default key pair. 
    */
  var expectedFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the key pair to delete.
    */
  var keyPairName: ResourceName
}
object DeleteKeyPairRequest {
  
  inline def apply(keyPairName: ResourceName): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
  
  extension [Self <: DeleteKeyPairRequest](x: Self) {
    
    inline def setExpectedFingerprint(value: String): Self = StObject.set(x, "expectedFingerprint", value.asInstanceOf[js.Any])
    
    inline def setExpectedFingerprintUndefined: Self = StObject.set(x, "expectedFingerprint", js.undefined)
    
    inline def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
  }
}
