package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnsDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
    */
  var TopicArn: js.UndefOr[String] = js.native
}

object SnsDestination {
  @scala.inline
  def apply(TopicArn: String = null): SnsDestination = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsDestination]
  }
}

