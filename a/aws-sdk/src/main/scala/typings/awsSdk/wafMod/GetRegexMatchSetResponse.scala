package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexMatchSetResponse extends js.Object {
  /**
    * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
    */
  var RegexMatchSet: js.UndefOr[typings.awsSdk.wafMod.RegexMatchSet] = js.native
}

object GetRegexMatchSetResponse {
  @scala.inline
  def apply(): GetRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegexMatchSetResponse]
  }
  @scala.inline
  implicit class GetRegexMatchSetResponseOps[Self <: GetRegexMatchSetResponse] (val x: Self) extends AnyVal {
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
    def setRegexMatchSet(value: RegexMatchSet): Self = this.set("RegexMatchSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexMatchSet: Self = this.set("RegexMatchSet", js.undefined)
  }
  
}

