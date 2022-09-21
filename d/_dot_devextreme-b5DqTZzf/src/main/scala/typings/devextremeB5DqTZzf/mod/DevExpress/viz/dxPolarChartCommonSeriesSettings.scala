package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxPolarChart.PolarChartSeriesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonSeriesSettings
  extends StObject
     with dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /**
    * An object that specifies configuration properties for all series of the area type in the chart.
    */
  var area: js.UndefOr[Any] = js.undefined
  
  /**
    * An object that specifies configuration properties for all series of the &apos;bar&apos; type in the chart.
    */
  var bar: js.UndefOr[Any] = js.undefined
  
  /**
    * An object that specifies configuration properties for all series of the &apos;line&apos; type in the chart.
    */
  var line: js.UndefOr[Any] = js.undefined
  
  /**
    * An object that specifies configuration properties for all series of the &apos;scatter&apos; type in the chart.
    */
  var scatter: js.UndefOr[Any] = js.undefined
  
  /**
    * An object that specifies configuration properties for all series of the &apos;stackedBar&apos; type in the chart.
    */
  var stackedbar: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a series type.
    */
  var `type`: js.UndefOr[PolarChartSeriesType] = js.undefined
}
object dxPolarChartCommonSeriesSettings {
  
  inline def apply(): dxPolarChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonSeriesSettings]
  }
  
  extension [Self <: dxPolarChartCommonSeriesSettings](x: Self) {
    
    inline def setArea(value: Any): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setBar(value: Any): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setLine(value: Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setScatter(value: Any): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
    
    inline def setScatterUndefined: Self = StObject.set(x, "scatter", js.undefined)
    
    inline def setStackedbar(value: Any): Self = StObject.set(x, "stackedbar", value.asInstanceOf[js.Any])
    
    inline def setStackedbarUndefined: Self = StObject.set(x, "stackedbar", js.undefined)
    
    inline def setType(value: PolarChartSeriesType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
