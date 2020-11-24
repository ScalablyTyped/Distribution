package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeserializeHandlerOutput[Output /* <: js.Object */] extends js.Object {
  
  var output: js.UndefOr[Output] = js.native
  
  /**
    * The raw response object from runtime is deserialized to structured output object.
    * The response object is unknown so you cannot modify it directly. When work with
    * response, you need to guard its type to e.g. HttpResponse with 'instanceof' operand.
    *
    * During the deserialize phase of the execution of a middleware stack, a deserialized
    * response may or may not be available
    */
  var response: js.Any = js.native
}
object DeserializeHandlerOutput {
  
  @scala.inline
  def apply[Output /* <: js.Object */](response: js.Any): DeserializeHandlerOutput[Output] = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeHandlerOutput[Output]]
  }
  
  @scala.inline
  implicit class DeserializeHandlerOutputOps[Self <: DeserializeHandlerOutput[_], Output /* <: js.Object */] (val x: Self with DeserializeHandlerOutput[Output]) extends AnyVal {
    
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
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
