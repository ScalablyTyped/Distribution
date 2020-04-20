package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

