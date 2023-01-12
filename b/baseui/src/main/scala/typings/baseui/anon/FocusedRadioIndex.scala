package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusedRadioIndex extends StObject {
  
  var focusedRadioIndex: Double
  
  var isFocusVisible: Boolean
}
object FocusedRadioIndex {
  
  inline def apply(focusedRadioIndex: Double, isFocusVisible: Boolean): FocusedRadioIndex = {
    val __obj = js.Dynamic.literal(focusedRadioIndex = focusedRadioIndex.asInstanceOf[js.Any], isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusedRadioIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusedRadioIndex] (val x: Self) extends AnyVal {
    
    inline def setFocusedRadioIndex(value: Double): Self = StObject.set(x, "focusedRadioIndex", value.asInstanceOf[js.Any])
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
