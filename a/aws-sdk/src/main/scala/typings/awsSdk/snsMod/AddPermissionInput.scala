package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionInput extends js.Object {
  /**
    * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must have AWS accounts, but do not need to be signed up for this service.
    */
  var AWSAccountId: DelegatesList = js.native
  /**
    * The action you want to allow for the specified principal(s). Valid values: Any Amazon SNS action name, for example Publish.
    */
  var ActionName: ActionsList = js.native
  /**
    * A unique identifier for the new policy statement.
    */
  var Label: label = js.native
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN = js.native
}

object AddPermissionInput {
  @scala.inline
  def apply(AWSAccountId: DelegatesList, ActionName: ActionsList, Label: label, TopicArn: topicARN): AddPermissionInput = {
    val __obj = js.Dynamic.literal(AWSAccountId = AWSAccountId.asInstanceOf[js.Any], ActionName = ActionName.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionInput]
  }
  @scala.inline
  implicit class AddPermissionInputOps[Self <: AddPermissionInput] (val x: Self) extends AnyVal {
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
    def setAWSAccountIdVarargs(value: delegate*): Self = this.set("AWSAccountId", js.Array(value :_*))
    @scala.inline
    def setAWSAccountId(value: DelegatesList): Self = this.set("AWSAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionNameVarargs(value: action*): Self = this.set("ActionName", js.Array(value :_*))
    @scala.inline
    def setActionName(value: ActionsList): Self = this.set("ActionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: label): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: topicARN): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
  }
  
}

