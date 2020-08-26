package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAction extends js.Object {
  /**
    * The scope of the StopAction. The only acceptable value is RuleSet.
    */
  var Scope: StopScope = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.native
}

object StopAction {
  @scala.inline
  def apply(Scope: StopScope): StopAction = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAction]
  }
  @scala.inline
  implicit class StopActionOps[Self <: StopAction] (val x: Self) extends AnyVal {
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
    def setScope(value: StopScope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: AmazonResourceName): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
  }
  
}

