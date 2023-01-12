package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemDefinition extends StObject {
  
  var command: String
  
  var group: String
  
  var icon: String
  
  var label: String
  
  var order: Double
}
object MenuItemDefinition {
  
  inline def apply(command: String, group: String, icon: String, label: String, order: Double): MenuItemDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemDefinition] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
