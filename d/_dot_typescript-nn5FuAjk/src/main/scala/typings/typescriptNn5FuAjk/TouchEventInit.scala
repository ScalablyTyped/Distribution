package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEventInit
  extends StObject
     with EventModifierInit {
  
  var changedTouches: js.UndefOr[Array[Touch]] = js.undefined
  
  var targetTouches: js.UndefOr[Array[Touch]] = js.undefined
  
  var touches: js.UndefOr[Array[Touch]] = js.undefined
}
object TouchEventInit {
  
  inline def apply(): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventInit]
  }
  
  extension [Self <: TouchEventInit](x: Self) {
    
    inline def setChangedTouches(value: Array[Touch]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
    
    inline def setTargetTouches(value: Array[Touch]): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
    
    inline def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
    
    inline def setTouches(value: Array[Touch]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
  }
}
