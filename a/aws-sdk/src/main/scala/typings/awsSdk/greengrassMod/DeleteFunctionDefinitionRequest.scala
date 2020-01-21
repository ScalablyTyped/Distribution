package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string = js.native
}

object DeleteFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: string): DeleteFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
  }
}

