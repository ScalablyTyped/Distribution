package typings.contentfulManagement.editorInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends js.Object {
  
  /**
    * the id of the customized field
    */
  var fieldId: String = js.native
  
  /**
    * customization associated to the field
    */
  var widgetId: String = js.native
  
  var widgetNamespace: String = js.native
}
object Control {
  
  @scala.inline
  def apply(fieldId: String, widgetId: String, widgetNamespace: String): Control = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], widgetId = widgetId.asInstanceOf[js.Any], widgetNamespace = widgetNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
    
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
    def setFieldId(value: String): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetId(value: String): Self = this.set("widgetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetNamespace(value: String): Self = this.set("widgetNamespace", value.asInstanceOf[js.Any])
  }
}
