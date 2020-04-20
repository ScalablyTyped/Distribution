package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName = js.native
  /**
    * The new or modified tags for the resource.
    */
  var tags: Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: AmazonResourceName, tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

