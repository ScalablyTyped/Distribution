package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRegexMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * A RegexMatchSet that contains no RegexMatchTuple objects.
    */
  var RegexMatchSet: js.UndefOr[typings.awsSdk.wafMod.RegexMatchSet] = js.native
}
object CreateRegexMatchSetResponse {
  
  @scala.inline
  def apply(): CreateRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateRegexMatchSetResponseMutableBuilder[Self <: CreateRegexMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setRegexMatchSet(value: RegexMatchSet): Self = StObject.set(x, "RegexMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchSetUndefined: Self = StObject.set(x, "RegexMatchSet", js.undefined)
  }
}
