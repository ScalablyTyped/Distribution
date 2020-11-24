package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeHandlerOutput[Output /* <: js.Object */] extends DeserializeHandlerOutput[Output] {
  
  @JSName("output")
  var output_InitializeHandlerOutput: Output = js.native
}
object InitializeHandlerOutput {
  
  @scala.inline
  def apply[Output /* <: js.Object */](output: Output, response: js.Any): InitializeHandlerOutput[Output] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeHandlerOutput[Output]]
  }
  
  @scala.inline
  implicit class InitializeHandlerOutputOps[Self <: InitializeHandlerOutput[_], Output /* <: js.Object */] (val x: Self with InitializeHandlerOutput[Output]) extends AnyVal {
    
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
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
