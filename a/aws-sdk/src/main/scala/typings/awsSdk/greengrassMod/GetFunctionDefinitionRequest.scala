package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string = js.native
}

object GetFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: string): GetFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDefinitionRequest]
  }
  @scala.inline
  implicit class GetFunctionDefinitionRequestOps[Self <: GetFunctionDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setFunctionDefinitionId(value: string): Self = this.set("FunctionDefinitionId", value.asInstanceOf[js.Any])
  }
  
}

