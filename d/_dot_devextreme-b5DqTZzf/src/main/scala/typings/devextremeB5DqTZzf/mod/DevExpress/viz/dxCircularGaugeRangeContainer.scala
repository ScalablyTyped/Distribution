package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inside
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCircularGaugeRangeContainer
  extends StObject
     with BaseGaugeRangeContainer {
  
  /**
    * Specifies the orientation of the range container in the CircularGauge UI component.
    */
  var orientation: js.UndefOr[center | inside | outside] = js.undefined
  
  /**
    * Specifies the range container&apos;s width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxCircularGaugeRangeContainer {
  
  inline def apply(): dxCircularGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeRangeContainer]
  }
  
  extension [Self <: dxCircularGaugeRangeContainer](x: Self) {
    
    inline def setOrientation(value: center | inside | outside): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
