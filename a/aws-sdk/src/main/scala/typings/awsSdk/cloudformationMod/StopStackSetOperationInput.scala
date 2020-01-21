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
}

