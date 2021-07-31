package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegexMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the UpdateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
}
object UpdateRegexMatchSetResponse {
  
  @scala.inline
  def apply(): UpdateRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegexMatchSetResponse]
  }
  
  @scala.inline
  implicit class UpdateRegexMatchSetResponseMutableBuilder[Self <: UpdateRegexMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
