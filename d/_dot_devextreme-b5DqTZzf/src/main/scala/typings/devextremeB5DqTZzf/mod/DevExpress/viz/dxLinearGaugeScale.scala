package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeScale
  extends StObject
     with BaseGaugeScale {
  
  /**
    * Specifies the orientation of scale ticks. Applies only if the geometry.orientation property is &apos;vertical&apos;.
    */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies common properties for scale labels.
    */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.undefined
  
  /**
    * Specifies the orientation of scale ticks. Applies only if the geometry.orientation property is &apos;horizontal&apos;.
    */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.undefined
}
object dxLinearGaugeScale {
  
  inline def apply(): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
  
  extension [Self <: dxLinearGaugeScale](x: Self) {
    
    inline def setHorizontalOrientation(value: center | left | right): Self = StObject.set(x, "horizontalOrientation", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOrientationUndefined: Self = StObject.set(x, "horizontalOrientation", js.undefined)
    
    inline def setLabel(value: dxLinearGaugeScaleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setVerticalOrientation(value: bottom | center | top): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
  }
}
