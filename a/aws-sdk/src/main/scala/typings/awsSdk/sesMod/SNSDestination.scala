package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSDestination extends js.Object {
  /**
    * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicARN: AmazonResourceName = js.native
}

object SNSDestination {
  @scala.inline
  def apply(TopicARN: AmazonResourceName): SNSDestination = {
    val __obj = js.Dynamic.literal(TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSDestination]
  }
  @scala.inline
  implicit class SNSDestinationOps[Self <: SNSDestination] (val x: Self) extends AnyVal {
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
    def setTopicARN(value: AmazonResourceName): Self = this.set("TopicARN", value.asInstanceOf[js.Any])
  }
  
}

