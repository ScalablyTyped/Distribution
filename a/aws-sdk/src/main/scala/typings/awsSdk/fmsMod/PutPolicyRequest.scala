package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy to be created.
    */
  var Policy: typings.awsSdk.fmsMod.Policy = js.native
  /**
    * The tags to add to the AWS resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.native
}

object PutPolicyRequest {
  @scala.inline
  def apply(Policy: Policy): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
  @scala.inline
  implicit class PutPolicyRequestOps[Self <: PutPolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
  
}

