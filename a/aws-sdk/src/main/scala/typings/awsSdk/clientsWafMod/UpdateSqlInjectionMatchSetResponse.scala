package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the UpdateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafMod.ChangeToken] = js.undefined
}
object UpdateSqlInjectionMatchSetResponse {
  
  inline def apply(): UpdateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
