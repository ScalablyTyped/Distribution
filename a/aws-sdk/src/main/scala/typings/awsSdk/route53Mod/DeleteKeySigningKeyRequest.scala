package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeySigningKeyRequest extends StObject {
  
  /**
    * A unique string used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
  
  /**
    * A string used to identify a key-signing key (KSK).
    */
  var Name: SigningKeyName
}
object DeleteKeySigningKeyRequest {
  
  inline def apply(HostedZoneId: ResourceId, Name: SigningKeyName): DeleteKeySigningKeyRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeySigningKeyRequest]
  }
  
  extension [Self <: DeleteKeySigningKeyRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setName(value: SigningKeyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
