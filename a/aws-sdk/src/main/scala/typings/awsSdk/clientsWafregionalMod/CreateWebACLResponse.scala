package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebACLResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
  
  /**
    * The WebACL returned in the CreateWebACL response.
    */
  var WebACL: js.UndefOr[typings.awsSdk.clientsWafregionalMod.WebACL] = js.undefined
}
object CreateWebACLResponse {
  
  inline def apply(): CreateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebACLResponse]
  }
  
  extension [Self <: CreateWebACLResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setWebACL(value: WebACL): Self = StObject.set(x, "WebACL", value.asInstanceOf[js.Any])
    
    inline def setWebACLUndefined: Self = StObject.set(x, "WebACL", js.undefined)
  }
}
