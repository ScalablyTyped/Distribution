package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the topic to which to add tags.
    */
  var ResourceArn: AmazonResourceName = js.native
  /**
    * The tags to be added to the specified topic. A tag consists of a required key and an optional value.
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

