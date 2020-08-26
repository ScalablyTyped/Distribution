package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexMatchSetRequest extends js.Object {
  /**
    * The RegexMatchSetId of the RegexMatchSet that you want to get. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId = js.native
}

object GetRegexMatchSetRequest {
  @scala.inline
  def apply(RegexMatchSetId: ResourceId): GetRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(RegexMatchSetId = RegexMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexMatchSetRequest]
  }
  @scala.inline
  implicit class GetRegexMatchSetRequestOps[Self <: GetRegexMatchSetRequest] (val x: Self) extends AnyVal {
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
    def setRegexMatchSetId(value: ResourceId): Self = this.set("RegexMatchSetId", value.asInstanceOf[js.Any])
  }
  
}

