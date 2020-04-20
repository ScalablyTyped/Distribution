package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the state machine to describe.
    */
  var stateMachineArn: Arn = js.native
}

object DescribeStateMachineInput {
  @scala.inline
  def apply(stateMachineArn: Arn): DescribeStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineInput]
  }
}

