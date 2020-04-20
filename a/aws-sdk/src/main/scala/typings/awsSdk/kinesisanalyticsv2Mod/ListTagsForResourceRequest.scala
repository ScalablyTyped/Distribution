package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the application for which to retrieve tags.
    */
  var ResourceARN: KinesisAnalyticsARN = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

