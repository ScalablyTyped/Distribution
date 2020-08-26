package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishFindingToSnsParams extends js.Object {
  /**
    * The ARN of the topic to which you want to publish the findings.
    */
  var topicArn: SnsTopicArn = js.native
}

object PublishFindingToSnsParams {
  @scala.inline
  def apply(topicArn: SnsTopicArn): PublishFindingToSnsParams = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFindingToSnsParams]
  }
  @scala.inline
  implicit class PublishFindingToSnsParamsOps[Self <: PublishFindingToSnsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTopicArn(value: SnsTopicArn): Self = this.set("topicArn", value.asInstanceOf[js.Any])
  }
  
}

