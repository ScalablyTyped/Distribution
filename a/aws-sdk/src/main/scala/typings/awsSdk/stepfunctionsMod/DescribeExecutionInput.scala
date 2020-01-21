package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExecutionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution to describe.
    */
  var executionArn: Arn = js.native
}

object DescribeExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): DescribeExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeExecutionInput]
  }
}

