package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDNSSECResponse extends StObject {
  
  /**
    * The key-signing keys (KSKs) in your account.
    */
  var KeySigningKeys: typings.awsSdk.route53Mod.KeySigningKeys
  
  /**
    * A string repesenting the status of DNSSEC.
    */
  var Status: DNSSECStatus
}
object GetDNSSECResponse {
  
  inline def apply(KeySigningKeys: KeySigningKeys, Status: DNSSECStatus): GetDNSSECResponse = {
    val __obj = js.Dynamic.literal(KeySigningKeys = KeySigningKeys.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDNSSECResponse]
  }
  
  extension [Self <: GetDNSSECResponse](x: Self) {
    
    inline def setKeySigningKeys(value: KeySigningKeys): Self = StObject.set(x, "KeySigningKeys", value.asInstanceOf[js.Any])
    
    inline def setKeySigningKeysVarargs(value: KeySigningKey*): Self = StObject.set(x, "KeySigningKeys", js.Array(value*))
    
    inline def setStatus(value: DNSSECStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
