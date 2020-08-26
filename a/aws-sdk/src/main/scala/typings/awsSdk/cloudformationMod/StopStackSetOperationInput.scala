package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopStackSetOperationInput extends js.Object {
  /**
    * The ID of the stack operation. 
    */
  var OperationId: ClientRequestToken = js.native
  /**
    * The name or unique ID of the stack set that you want to stop the operation for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}

object StopStackSetOperationInput {
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): StopStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStackSetOperationInput]
  }
  @scala.inline
  implicit class StopStackSetOperationInputOps[Self <: StopStackSetOperationInput] (val x: Self) extends AnyVal {
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
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
  }
  
}

