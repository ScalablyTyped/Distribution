package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource. The Firewall Manager policy is the only AWS resource that supports tagging, so this ARN is a policy ARN.
    */
  var ResourceArn: typings.awsSdk.fmsMod.ResourceArn = js.native
  /**
    * The tags to add to the resource.
    */
  var TagList: typings.awsSdk.fmsMod.TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagList: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

