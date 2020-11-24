package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.finalizeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizeRequestHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_FinalizeRequestHandlerOptions: finalizeRequest = js.native
}
object FinalizeRequestHandlerOptions {
  
  @scala.inline
  def apply(step: finalizeRequest): FinalizeRequestHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeRequestHandlerOptions]
  }
  
  @scala.inline
  implicit class FinalizeRequestHandlerOptionsOps[Self <: FinalizeRequestHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setStep(value: finalizeRequest): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
