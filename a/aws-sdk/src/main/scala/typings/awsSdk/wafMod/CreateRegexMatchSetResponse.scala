package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRegexMatchSetResponse extends js.Object {
  
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
  implicit class CreateRegexMatchSetResponseOps[Self <: CreateRegexMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    
    @scala.inline
    def setRegexMatchSet(value: RegexMatchSet): Self = this.set("RegexMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatchSet: Self = this.set("RegexMatchSet", js.undefined)
  }
}
