package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsMinorTick extends StObject {
  
  /**
    * Specifies a color for the minor ticks.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies minor tick length.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an opacity for the minor ticks.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether or not the minor ticks are displayed on an axis.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies minor tick width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxPolarChartCommonAxisSettingsMinorTick {
  
  inline def apply(): dxPolarChartCommonAxisSettingsMinorTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsMinorTick]
  }
  
  extension [Self <: dxPolarChartCommonAxisSettingsMinorTick](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
