package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStateMachineInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the state machine to delete.
    */
  var stateMachineArn: Arn = js.native
}

object DeleteStateMachineInput {
  @scala.inline
  def apply(stateMachineArn: Arn): DeleteStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStateMachineInput]
  }
  @scala.inline
  implicit class DeleteStateMachineInputOps[Self <: DeleteStateMachineInput] (val x: Self) extends AnyVal {
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
    def setStateMachineArn(value: Arn): Self = this.set("stateMachineArn", value.asInstanceOf[js.Any])
  }
  
}

