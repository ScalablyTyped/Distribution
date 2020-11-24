package typings.blueprintjsCore.controlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckboxState extends js.Object {
  
  var indeterminate: Boolean = js.native
}
object ICheckboxState {
  
  @scala.inline
  def apply(indeterminate: Boolean): ICheckboxState = {
    val __obj = js.Dynamic.literal(indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxState]
  }
  
  @scala.inline
  implicit class ICheckboxStateOps[Self <: ICheckboxState] (val x: Self) extends AnyVal {
    
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
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
  }
}
