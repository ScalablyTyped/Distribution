package typings.chartist.anon

import typings.chartist.chartistStrings.labelInterpolationFnc
import typings.chartist.chartistStrings.labelOffset
import typings.chartist.chartistStrings.offset
import typings.chartist.chartistStrings.position
import typings.chartist.chartistStrings.scaleMinSpace
import typings.chartist.chartistStrings.showGrid
import typings.chartist.chartistStrings.showLabel
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.Plugin
import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.lineChartTypesMod.LineInterpolation
import typings.chartist.svgMod.SvgPath
import typings.chartist.utilsTypesMod.RequiredKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults, 'series'> */
trait OmitLineChartOptionsWithD extends StObject {
  
  var areaBase: js.UndefOr[Double] = js.undefined
  
  var axisX: js.UndefOr[
    RequiredKeys[
      AxisOptions, 
      offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
      scala.Nothing
    ]
  ] = js.undefined
  
  var axisY: js.UndefOr[
    RequiredKeys[
      AxisOptions, 
      offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
      scala.Nothing
    ]
  ] = js.undefined
  
  var chartPadding: js.UndefOr[Double | PartialChartPadding] = js.undefined
  
  var classNames: js.UndefOr[Area] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var high: js.UndefOr[Double] = js.undefined
  
  var lineSmooth: js.UndefOr[Boolean | LineInterpolation] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
  
  var referenceValue: js.UndefOr[Double] = js.undefined
  
  var reverseData: js.UndefOr[Boolean] = js.undefined
  
  var showArea: js.UndefOr[Boolean] = js.undefined
  
  var showGridBackground: js.UndefOr[Boolean] = js.undefined
  
  var showLine: js.UndefOr[Boolean] = js.undefined
  
  var showPoint: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object OmitLineChartOptionsWithD {
  
  inline def apply(): OmitLineChartOptionsWithD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitLineChartOptionsWithD]
  }
  
  extension [Self <: OmitLineChartOptionsWithD](x: Self) {
    
    inline def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
    
    inline def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
    
    inline def setAxisX(
      value: RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
          scala.Nothing
        ]
    ): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    inline def setAxisY(
      value: RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
    ): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    inline def setChartPadding(value: Double | PartialChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    inline def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    inline def setClassNames(value: Area): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLineSmooth(value: Boolean | LineInterpolation): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
    
    inline def setLineSmoothFunction2(value: (/* pathCoordinates */ js.Array[Double], /* valueData */ js.Array[SegmentData]) => SvgPath): Self = StObject.set(x, "lineSmooth", js.Any.fromFunction2(value))
    
    inline def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
    
    inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
    
    inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
    
    inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
    
    inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
    
    inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
    
    inline def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
    
    inline def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
