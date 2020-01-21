package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnsDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email events to. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName = js.native
}

object SnsDestination {
  @scala.inline
  def apply(TopicArn: AmazonResourceName): SnsDestination = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnsDestination]
  }
}

