package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisibleIsSelected extends StObject {
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isSelected")
  var $isSelected: Boolean
}
object IsFocusVisibleIsSelected {
  
  inline def apply($isFocusVisible: Boolean, $isSelected: Boolean): IsFocusVisibleIsSelected = {
    val __obj = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocusVisibleIsSelected]
  }
  
  extension [Self <: IsFocusVisibleIsSelected](x: Self) {
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
  }
}
