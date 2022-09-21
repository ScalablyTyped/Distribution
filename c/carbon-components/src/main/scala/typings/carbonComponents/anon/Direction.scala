package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var menuSize: Height
  
  var offset: js.UndefOr[Partialleftnumbertopnumbe] = js.undefined
  
  var refPosition: Partialtopnumberrightnumb
  
  var scrollX: js.UndefOr[Double] = js.undefined
  
  var scrollY: js.UndefOr[Double] = js.undefined
}
object Direction {
  
  inline def apply(menuSize: Height, refPosition: Partialtopnumberrightnumb): Direction = {
    val __obj = js.Dynamic.literal(menuSize = menuSize.asInstanceOf[js.Any], refPosition = refPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setMenuSize(value: Height): Self = StObject.set(x, "menuSize", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Partialleftnumbertopnumbe): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRefPosition(value: Partialtopnumberrightnumb): Self = StObject.set(x, "refPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
  }
}
