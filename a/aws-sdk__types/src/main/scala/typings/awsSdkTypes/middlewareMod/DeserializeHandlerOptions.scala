package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.deserialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeserializeHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_DeserializeHandlerOptions: deserialize = js.native
}
object DeserializeHandlerOptions {
  
  @scala.inline
  def apply(step: deserialize): DeserializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeHandlerOptions]
  }
  
  @scala.inline
  implicit class DeserializeHandlerOptionsOps[Self <: DeserializeHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setStep(value: deserialize): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
