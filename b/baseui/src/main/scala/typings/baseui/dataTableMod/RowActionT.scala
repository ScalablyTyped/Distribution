package typings.baseui.dataTableMod

import typings.baseui.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowActionT extends js.Object {
  
  var label: String = js.native
  
  def onClick(params: Event): js.Any = js.native
  
  var renderIcon: js.Any = js.native
}
object RowActionT {
  
  @scala.inline
  def apply(label: String, onClick: Event => js.Any, renderIcon: js.Any): RowActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionT]
  }
  
  @scala.inline
  implicit class RowActionTOps[Self <: RowActionT] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: Event => js.Any): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderIcon(value: js.Any): Self = this.set("renderIcon", value.asInstanceOf[js.Any])
  }
}
