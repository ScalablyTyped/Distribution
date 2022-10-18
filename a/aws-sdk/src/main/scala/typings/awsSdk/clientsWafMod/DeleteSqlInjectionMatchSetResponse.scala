package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the DeleteSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafMod.ChangeToken] = js.undefined
}
object DeleteSqlInjectionMatchSetResponse {
  
  inline def apply(): DeleteSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSqlInjectionMatchSetResponse]
  }
  
  extension [Self <: DeleteSqlInjectionMatchSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
