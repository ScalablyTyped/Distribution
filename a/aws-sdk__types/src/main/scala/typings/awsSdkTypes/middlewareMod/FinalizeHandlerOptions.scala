package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.finalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_FinalizeHandlerOptions: finalize = js.native
}

object FinalizeHandlerOptions {
  @scala.inline
  def apply(step: finalize): FinalizeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerOptions]
  }
  @scala.inline
  implicit class FinalizeHandlerOptionsOps[Self <: FinalizeHandlerOptions] (val x: Self) extends AnyVal {
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
    def setStep(value: finalize): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

