package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisConstantLines
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * Specifies whether to display the constant line behind or in front of the series.
    */
  var displayBehindSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to extend the axis&apos;s default visual range to display the constant line.
    */
  var extendAxis: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the constant line label.
    */
  @JSName("label")
  var label_dxChartArgumentAxisConstantLines: js.UndefOr[dxChartArgumentAxisConstantLinesLabel] = js.undefined
  
  /**
    * Specifies the value indicated by a constant line. Setting this property is necessary.
    */
  var value: js.UndefOr[Double | js.Date | String] = js.undefined
}
object dxChartArgumentAxisConstantLines {
  
  inline def apply(): dxChartArgumentAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLines]
  }
  
  extension [Self <: dxChartArgumentAxisConstantLines](x: Self) {
    
    inline def setDisplayBehindSeries(value: Boolean): Self = StObject.set(x, "displayBehindSeries", value.asInstanceOf[js.Any])
    
    inline def setDisplayBehindSeriesUndefined: Self = StObject.set(x, "displayBehindSeries", js.undefined)
    
    inline def setExtendAxis(value: Boolean): Self = StObject.set(x, "extendAxis", value.asInstanceOf[js.Any])
    
    inline def setExtendAxisUndefined: Self = StObject.set(x, "extendAxis", js.undefined)
    
    inline def setLabel(value: dxChartArgumentAxisConstantLinesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: Double | js.Date | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
