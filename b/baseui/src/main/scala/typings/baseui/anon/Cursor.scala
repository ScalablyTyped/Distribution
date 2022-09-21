package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  @JSName("$cursor")
  var $cursor: js.UndefOr[String] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$sticky")
  var $sticky: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$width")
  var $width: js.UndefOr[String] = js.undefined
}
object Cursor {
  
  inline def apply(): Cursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cursor]
  }
  
  extension [Self <: Cursor](x: Self) {
    
    inline def set$cursor(value: String): Self = StObject.set(x, "$cursor", value.asInstanceOf[js.Any])
    
    inline def set$cursorUndefined: Self = StObject.set(x, "$cursor", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def set$sticky(value: Boolean): Self = StObject.set(x, "$sticky", value.asInstanceOf[js.Any])
    
    inline def set$stickyUndefined: Self = StObject.set(x, "$sticky", js.undefined)
    
    inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
    
    inline def set$widthUndefined: Self = StObject.set(x, "$width", js.undefined)
  }
}
