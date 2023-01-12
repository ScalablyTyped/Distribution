package typings.carbonComponentsReact

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextMenuUseContextMenuMod {
  
  @JSImport("carbon-components-react/lib/components/ContextMenu/useContextMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(trigger: EventTarget): UseContextMenuResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(trigger.asInstanceOf[js.Any]).asInstanceOf[UseContextMenuResult]
  
  trait UseContextMenuResult extends StObject {
    
    def onClose(): Unit
    
    var open: Boolean
    
    var x: Double
    
    var y: Double
  }
  object UseContextMenuResult {
    
    inline def apply(onClose: () => Unit, open: Boolean, x: Double, y: Double): UseContextMenuResult = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), open = open.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseContextMenuResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseContextMenuResult] (val x: Self) extends AnyVal {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
