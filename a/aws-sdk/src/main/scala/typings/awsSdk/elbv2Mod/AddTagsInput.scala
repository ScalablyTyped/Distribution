package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typings.awsSdk.elbv2Mod.ResourceArns = js.native
  /**
    * The tags.
    */
  var Tags: TagList = js.native
}

object AddTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
}

