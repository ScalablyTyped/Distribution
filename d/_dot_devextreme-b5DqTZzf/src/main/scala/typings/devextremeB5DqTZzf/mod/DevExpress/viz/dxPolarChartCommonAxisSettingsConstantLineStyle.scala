package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsConstantLineStyle extends StObject {
  
  /**
    * Specifies a color for a constant line.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a dash style for a constant line.
    */
  var dashStyle: js.UndefOr[DashStyleType] = js.undefined
  
  /**
    * An object defining constant line label properties.
    */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  
  /**
    * Specifies a constant line width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxPolarChartCommonAxisSettingsConstantLineStyle {
  
  inline def apply(): dxPolarChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyle]
  }
  
  extension [Self <: dxPolarChartCommonAxisSettingsConstantLineStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyleType): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setLabel(value: dxPolarChartCommonAxisSettingsConstantLineStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
