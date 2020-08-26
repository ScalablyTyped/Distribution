package typings.awsSdk.sesv2Mod

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
  @scala.inline
  implicit class SnsDestinationOps[Self <: SnsDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTopicArn(value: AmazonResourceName): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
  }
  
}

