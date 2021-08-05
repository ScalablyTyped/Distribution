package typings.chui.anon

import typings.chui.ChocolateChipElementArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loop extends StObject {
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  var panels: ChocolateChipElementArray
  
  var target: js.Any
}
object Loop {
  
  inline def apply(panels: ChocolateChipElementArray, target: js.Any): Loop = {
    val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  extension [Self <: Loop](x: Self) {
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setPanels(value: ChocolateChipElementArray): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
