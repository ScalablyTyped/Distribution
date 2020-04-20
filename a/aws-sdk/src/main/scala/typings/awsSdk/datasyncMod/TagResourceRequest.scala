package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to apply the tag to.
    */
  var ResourceArn: TaggableResourceArn = js.native
  /**
    * The tags to apply.
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: TaggableResourceArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

