package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumn extends StObject {
  
  @JSName("$gridColumn")
  var $gridColumn: js.UndefOr[String] = js.undefined
  
  @JSName("$gridRow")
  var $gridRow: js.UndefOr[String] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$striped")
  var $striped: js.UndefOr[Boolean] = js.undefined
}
object GridColumn {
  
  inline def apply(): GridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumn] (val x: Self) extends AnyVal {
    
    inline def set$gridColumn(value: String): Self = StObject.set(x, "$gridColumn", value.asInstanceOf[js.Any])
    
    inline def set$gridColumnUndefined: Self = StObject.set(x, "$gridColumn", js.undefined)
    
    inline def set$gridRow(value: String): Self = StObject.set(x, "$gridRow", value.asInstanceOf[js.Any])
    
    inline def set$gridRowUndefined: Self = StObject.set(x, "$gridRow", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def set$striped(value: Boolean): Self = StObject.set(x, "$striped", value.asInstanceOf[js.Any])
    
    inline def set$stripedUndefined: Self = StObject.set(x, "$striped", js.undefined)
  }
}
