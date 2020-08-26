package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRegexPatternSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to delete. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
}

object DeleteRegexPatternSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId): DeleteRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegexPatternSetRequest]
  }
  @scala.inline
  implicit class DeleteRegexPatternSetRequestOps[Self <: DeleteRegexPatternSetRequest] (val x: Self) extends AnyVal {
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
    def setRegexPatternSetId(value: ResourceId): Self = this.set("RegexPatternSetId", value.asInstanceOf[js.Any])
  }
  
}

