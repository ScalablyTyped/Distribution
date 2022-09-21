package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait buttonDefinition extends StObject {
  
  var command: String
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconOffset: js.UndefOr[Double] = js.undefined
  
  var label: String
  
  var toolbar: String
}
object buttonDefinition {
  
  inline def apply(command: String, label: String, toolbar: String): buttonDefinition = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[buttonDefinition]
  }
  
  extension [Self <: buttonDefinition](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconOffset(value: Double): Self = StObject.set(x, "iconOffset", value.asInstanceOf[js.Any])
    
    inline def setIconOffsetUndefined: Self = StObject.set(x, "iconOffset", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setToolbar(value: String): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
  }
}
