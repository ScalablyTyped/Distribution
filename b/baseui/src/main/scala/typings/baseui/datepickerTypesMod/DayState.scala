package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayState extends StObject {
  
  var isFocusVisible: Boolean
  
  var isHovered: Boolean
}
object DayState {
  
  inline def apply(isFocusVisible: Boolean, isHovered: Boolean): DayState = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayState]
  }
  
  extension [Self <: DayState](x: Self) {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
