package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the DeleteRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.undefined
}
object DeleteRuleResponse {
  
  @scala.inline
  def apply(): DeleteRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRuleResponse]
  }
  
  @scala.inline
  implicit class DeleteRuleResponseMutableBuilder[Self <: DeleteRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
