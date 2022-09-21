package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeySigningKeyResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
  
  /**
    * The key-signing key (KSK) that the request creates.
    */
  var KeySigningKey: typings.awsSdk.route53Mod.KeySigningKey
  
  /**
    * The unique URL representing the new key-signing key (KSK).
    */
  var Location: ResourceURI
}
object CreateKeySigningKeyResponse {
  
  inline def apply(ChangeInfo: ChangeInfo, KeySigningKey: KeySigningKey, Location: ResourceURI): CreateKeySigningKeyResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any], KeySigningKey = KeySigningKey.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeySigningKeyResponse]
  }
  
  extension [Self <: CreateKeySigningKeyResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
    
    inline def setKeySigningKey(value: KeySigningKey): Self = StObject.set(x, "KeySigningKey", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
