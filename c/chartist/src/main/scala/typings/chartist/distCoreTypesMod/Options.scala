package typings.chartist.distCoreTypesMod

import typings.chartist.anon.PartialChartPadding
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[TXAxisOptions, TYAxisOptions] extends StObject {
  
  /**
    * Options for X-Axis
    */
  var axisX: js.UndefOr[TXAxisOptions] = js.undefined
  
  /**
    * Options for Y-Axis
    */
  var axisY: js.UndefOr[TYAxisOptions] = js.undefined
  
  /**
    *  Padding of the chart drawing area to the container element and labels as a number or padding object.
    */
  var chartPadding: js.UndefOr[Double | PartialChartPadding] = js.undefined
  
  /**
    * Override the class names that get used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
    */
  var high: js.UndefOr[Double] = js.undefined
  
  /**
    * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
    */
  var low: js.UndefOr[Double] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
  
  /**
    * Unless low/high are explicitly set, bar chart will be centered at zero by default. Set referenceValue to null to auto scale.
    */
  var referenceValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object Options {
  
  inline def apply[TXAxisOptions, TYAxisOptions](): Options[TXAxisOptions, TYAxisOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TXAxisOptions, TYAxisOptions]]
  }
  
  extension [Self <: Options[?, ?], TXAxisOptions, TYAxisOptions](x: Self & (Options[TXAxisOptions, TYAxisOptions])) {
    
    inline def setAxisX(value: TXAxisOptions): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    inline def setAxisY(value: TYAxisOptions): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    inline def setChartPadding(value: Double | PartialChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    inline def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    inline def setClassNames(value: Record[String, String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
