package typings.blueprintjsTable.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnInteractionBarContextTypes extends js.Object {
  
  var enableColumnInteractionBar: Boolean = js.native
}
object IColumnInteractionBarContextTypes {
  
  @scala.inline
  def apply(enableColumnInteractionBar: Boolean): IColumnInteractionBarContextTypes = {
    val __obj = js.Dynamic.literal(enableColumnInteractionBar = enableColumnInteractionBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInteractionBarContextTypes]
  }
  
  @scala.inline
  implicit class IColumnInteractionBarContextTypesOps[Self <: IColumnInteractionBarContextTypes] (val x: Self) extends AnyVal {
    
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
    def setEnableColumnInteractionBar(value: Boolean): Self = this.set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
  }
}
