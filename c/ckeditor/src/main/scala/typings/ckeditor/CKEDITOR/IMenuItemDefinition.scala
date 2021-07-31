package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMenuItemDefinition extends StObject {
  
  var command: String
  
  var group: String
  
  var icon: String
  
  var label: String
  
  var order: Double
}
object IMenuItemDefinition {
  
  @scala.inline
  def apply(command: String, group: String, icon: String, label: String, order: Double): IMenuItemDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItemDefinition]
  }
  
  @scala.inline
  implicit class IMenuItemDefinitionMutableBuilder[Self <: IMenuItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
