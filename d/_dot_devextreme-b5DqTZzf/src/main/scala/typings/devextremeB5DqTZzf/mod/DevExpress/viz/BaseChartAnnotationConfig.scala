package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartAnnotationConfig
  extends StObject
     with BaseWidgetAnnotationConfig {
  
  /**
    * Positions the annotation relative to a specific argument.
    */
  var argument: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Anchors the annotation to a series point. Accepts the name of the point&apos;s series.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * Positions the annotation relative to a value on the specified value axis.
    */
  var value: js.UndefOr[Double | js.Date | String] = js.undefined
}
object BaseChartAnnotationConfig {
  
  inline def apply(): BaseChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartAnnotationConfig]
  }
  
  extension [Self <: BaseChartAnnotationConfig](x: Self) {
    
    inline def setArgument(value: Double | js.Date | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setValue(value: Double | js.Date | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
