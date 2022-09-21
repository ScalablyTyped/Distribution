package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMonthDropdownOpen extends StObject {
  
  var isFocusVisible: Boolean
  
  var isMonthDropdownOpen: Boolean
  
  var isYearDropdownOpen: Boolean
}
object IsMonthDropdownOpen {
  
  inline def apply(isFocusVisible: Boolean, isMonthDropdownOpen: Boolean, isYearDropdownOpen: Boolean): IsMonthDropdownOpen = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isMonthDropdownOpen = isMonthDropdownOpen.asInstanceOf[js.Any], isYearDropdownOpen = isYearDropdownOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMonthDropdownOpen]
  }
  
  extension [Self <: IsMonthDropdownOpen](x: Self) {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsMonthDropdownOpen(value: Boolean): Self = StObject.set(x, "isMonthDropdownOpen", value.asInstanceOf[js.Any])
    
    inline def setIsYearDropdownOpen(value: Boolean): Self = StObject.set(x, "isYearDropdownOpen", value.asInstanceOf[js.Any])
  }
}
