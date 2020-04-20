package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStateMachineOutput extends js.Object {
  /**
    * The date and time the state machine was updated.
    */
  var updateDate: Timestamp = js.native
}

object UpdateStateMachineOutput {
  @scala.inline
  def apply(updateDate: Timestamp): UpdateStateMachineOutput = {
    val __obj = js.Dynamic.literal(updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineOutput]
  }
}

