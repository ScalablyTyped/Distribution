package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateByteMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the UpdateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
}
object UpdateByteMatchSetResponse {
  
  inline def apply(): UpdateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateByteMatchSetResponse]
  }
  
  extension [Self <: UpdateByteMatchSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
