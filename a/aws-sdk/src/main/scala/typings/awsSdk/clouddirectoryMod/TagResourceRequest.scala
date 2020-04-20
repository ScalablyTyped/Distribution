package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource. Tagging is only supported for directories.
    */
  var ResourceArn: Arn = js.native
  /**
    * A list of tag key-value pairs.
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

