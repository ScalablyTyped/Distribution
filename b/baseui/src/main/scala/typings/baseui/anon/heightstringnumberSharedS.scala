package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $height :string | number} & baseui.baseui/accordion/types.SharedStylePropsArg */
trait heightstringnumberSharedS extends StObject {
  
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("$height")
  var $height: String | Double
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.undefined
}
object heightstringnumberSharedS {
  
  inline def apply($height: String | Double, $isFocusVisible: Boolean): heightstringnumberSharedS = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[heightstringnumberSharedS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: heightstringnumberSharedS] (val x: Self) extends AnyVal {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledNull: Self = StObject.set(x, "$disabled", null)
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$expanded(value: Boolean): Self = StObject.set(x, "$expanded", value.asInstanceOf[js.Any])
    
    inline def set$expandedNull: Self = StObject.set(x, "$expanded", null)
    
    inline def set$expandedUndefined: Self = StObject.set(x, "$expanded", js.undefined)
    
    inline def set$height(value: String | Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$size(value: String | Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
  }
}
