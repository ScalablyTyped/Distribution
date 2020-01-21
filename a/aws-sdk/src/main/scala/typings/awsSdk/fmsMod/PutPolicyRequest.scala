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
  def apply(Policy: Policy, TagList: TagList = null): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
}

