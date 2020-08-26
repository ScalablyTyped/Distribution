package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
    */
  var Name: ResourceName = js.native
}

object CreateRegexMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexMatchSetRequest]
  }
  @scala.inline
  implicit class CreateRegexMatchSetRequestOps[Self <: CreateRegexMatchSetRequest] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

