package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeTokenStatusRequest extends StObject {
  
  /**
    * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
}
object GetChangeTokenStatusRequest {
  
  inline def apply(ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusRequest]
  }
  
  extension [Self <: GetChangeTokenStatusRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
  }
}
