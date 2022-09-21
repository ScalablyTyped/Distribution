package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCircularGaugeScale
  extends StObject
     with BaseGaugeScale {
  
  /**
    * Specifies common properties for scale labels.
    */
  @JSName("label")
  var label_dxCircularGaugeScale: js.UndefOr[dxCircularGaugeScaleLabel] = js.undefined
  
  /**
    * Specifies the orientation of scale ticks.
    */
  var orientation: js.UndefOr[center | inside | outside] = js.undefined
}
object dxCircularGaugeScale {
  
  inline def apply(): dxCircularGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScale]
  }
  
  extension [Self <: dxCircularGaugeScale](x: Self) {
    
    inline def setLabel(value: dxCircularGaugeScaleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrientation(value: center | inside | outside): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
