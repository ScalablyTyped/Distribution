package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: ARN = js.native
  /**
    * One or more tags. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ARN, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

