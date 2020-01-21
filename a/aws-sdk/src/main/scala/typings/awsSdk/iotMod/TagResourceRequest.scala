package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The new or modified tags for the resource.
    */
  var tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

