package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the canary that you're adding tags to. The ARN format of a canary is arn:aws:synthetics:Region:account-id:canary:canary-name .
    */
  var ResourceArn: Arn = js.native
  /**
    * The list of key-value pairs to associate with the canary.
    */
  var Tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

