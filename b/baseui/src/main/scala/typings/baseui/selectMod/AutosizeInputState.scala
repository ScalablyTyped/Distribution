package typings.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosizeInputState extends js.Object {
  
  var inputWidth: Double = js.native
}
object AutosizeInputState {
  
  @scala.inline
  def apply(inputWidth: Double): AutosizeInputState = {
    val __obj = js.Dynamic.literal(inputWidth = inputWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputState]
  }
  
  @scala.inline
  implicit class AutosizeInputStateOps[Self <: AutosizeInputState] (val x: Self) extends AnyVal {
    
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
    def setInputWidth(value: Double): Self = this.set("inputWidth", value.asInstanceOf[js.Any])
  }
}
