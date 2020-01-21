package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOperationInput extends js.Object {
  /**
    * The unique ID of the stack set operation. 
    */
  var OperationId: ClientRequestToken = js.native
  /**
    * The name or the unique stack ID of the stack set for the stack operation.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}

object DescribeStackSetOperationInput {
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): DescribeStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStackSetOperationInput]
  }
}

