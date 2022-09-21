package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootboxButton extends StObject {
  
  var callback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object BootboxButton {
  
  inline def apply(): BootboxButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxButton]
  }
  
  extension [Self <: BootboxButton](x: Self) {
    
    inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
