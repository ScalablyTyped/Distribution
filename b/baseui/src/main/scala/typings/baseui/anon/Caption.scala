package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caption extends StObject {
  
  var caption: Any
  
  var counter: Boolean
  
  var disabled: Boolean
  
  var label: Any
}
object Caption {
  
  inline def apply(caption: Any, counter: Boolean, disabled: Boolean, label: Any): Caption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Caption] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: Any): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
