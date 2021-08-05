package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelOption extends StObject {
  
  var adjustTime: Double
  
  var rotate: Double
  
  var selectedIndex: Double
  
  var wheelItemClass: String
  
  var wheelWrapperClass: String
}
object WheelOption {
  
  inline def apply(
    adjustTime: Double,
    rotate: Double,
    selectedIndex: Double,
    wheelItemClass: String,
    wheelWrapperClass: String
  ): WheelOption = {
    val __obj = js.Dynamic.literal(adjustTime = adjustTime.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], wheelItemClass = wheelItemClass.asInstanceOf[js.Any], wheelWrapperClass = wheelWrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelOption]
  }
  
  extension [Self <: WheelOption](x: Self) {
    
    inline def setAdjustTime(value: Double): Self = StObject.set(x, "adjustTime", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setWheelItemClass(value: String): Self = StObject.set(x, "wheelItemClass", value.asInstanceOf[js.Any])
    
    inline def setWheelWrapperClass(value: String): Self = StObject.set(x, "wheelWrapperClass", value.asInstanceOf[js.Any])
  }
}
