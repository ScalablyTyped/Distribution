package typings.baseui.formControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControlState extends js.Object {
  
  var captionId: String = js.native
}
object FormControlState {
  
  @scala.inline
  def apply(captionId: String): FormControlState = {
    val __obj = js.Dynamic.literal(captionId = captionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlState]
  }
  
  @scala.inline
  implicit class FormControlStateOps[Self <: FormControlState] (val x: Self) extends AnyVal {
    
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
    def setCaptionId(value: String): Self = this.set("captionId", value.asInstanceOf[js.Any])
  }
}
