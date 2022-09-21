package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.End
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeRangeContainer
  extends StObject
     with BaseGaugeRangeContainer {
  
  /**
    * Specifies the orientation of the range container. Applies only if the geometry.orientation property is &apos;vertical&apos;.
    */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies the orientation of the range container. Applies only if the geometry.orientation property is &apos;horizontal&apos;.
    */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.undefined
  
  /**
    * Specifies the width of the range container&apos;s start and end boundaries in the LinearGauge UI component.
    */
  var width: js.UndefOr[End | Double] = js.undefined
}
object dxLinearGaugeRangeContainer {
  
  inline def apply(): dxLinearGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeRangeContainer]
  }
  
  extension [Self <: dxLinearGaugeRangeContainer](x: Self) {
    
    inline def setHorizontalOrientation(value: center | left | right): Self = StObject.set(x, "horizontalOrientation", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOrientationUndefined: Self = StObject.set(x, "horizontalOrientation", js.undefined)
    
    inline def setVerticalOrientation(value: bottom | center | top): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
    
    inline def setWidth(value: End | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
