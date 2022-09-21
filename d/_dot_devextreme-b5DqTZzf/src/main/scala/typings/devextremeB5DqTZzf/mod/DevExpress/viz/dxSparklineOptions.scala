package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.area
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bar
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cross
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.line
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.polygon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.spline
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.splinearea
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.square
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.steparea
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.stepline
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.winloss
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSparklineOptions
  extends StObject
     with BaseSparklineOptions[dxSparkline] {
  
  /**
    * Specifies the data source field that provides arguments for a sparkline.
    */
  var argumentField: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a color for the bars indicating negative values. Available for a sparkline of the bar type only.
    */
  var barNegativeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a color for the bars indicating positive values. Available for a sparkline of the bar type only.
    */
  var barPositiveColor: js.UndefOr[String] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Sets a color for the boundary of both the first and last points on a sparkline.
    */
  var firstLastColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the sparkline should ignore null data points.
    */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets a color for a line on a sparkline. Available for the sparklines of the line- and area-like types.
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a width for a line on a sparkline. Available for the sparklines of the line- and area-like types.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets a color for the bars indicating the values that are less than the winloss threshold. Available for a sparkline of the winloss type only.
    */
  var lossColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a color for the boundary of the maximum point on a sparkline.
    */
  var maxColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum value of the sparkline&apos;s value axis.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets a color for the boundary of the minimum point on a sparkline.
    */
  var minColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the minimum value of the sparkline value axis.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets a color for points on a sparkline. Available for the sparklines of the line- and area-like types.
    */
  var pointColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the diameter of sparkline points in pixels. Available for the sparklines of line- and area-like types.
    */
  var pointSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a symbol to use as a point marker on a sparkline. Available for the sparklines of the line- and area-like types.
    */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  
  /**
    * Specifies whether or not to indicate both the first and last values on a sparkline.
    */
  var showFirstLast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to indicate both the minimum and maximum values on a sparkline.
    */
  var showMinMax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the type of a sparkline.
    */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.undefined
  
  /**
    * Specifies the data source field that provides values for a sparkline.
    */
  var valueField: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a color for the bars indicating the values greater than a winloss threshold. Available for a sparkline of the winloss type only.
    */
  var winColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that serves as a threshold for the sparkline of the winloss type.
    */
  var winlossThreshold: js.UndefOr[Double] = js.undefined
}
object dxSparklineOptions {
  
  inline def apply(): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSparklineOptions]
  }
  
  extension [Self <: dxSparklineOptions](x: Self) {
    
    inline def setArgumentField(value: String): Self = StObject.set(x, "argumentField", value.asInstanceOf[js.Any])
    
    inline def setArgumentFieldUndefined: Self = StObject.set(x, "argumentField", js.undefined)
    
    inline def setBarNegativeColor(value: String): Self = StObject.set(x, "barNegativeColor", value.asInstanceOf[js.Any])
    
    inline def setBarNegativeColorUndefined: Self = StObject.set(x, "barNegativeColor", js.undefined)
    
    inline def setBarPositiveColor(value: String): Self = StObject.set(x, "barPositiveColor", value.asInstanceOf[js.Any])
    
    inline def setBarPositiveColorUndefined: Self = StObject.set(x, "barPositiveColor", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setFirstLastColor(value: String): Self = StObject.set(x, "firstLastColor", value.asInstanceOf[js.Any])
    
    inline def setFirstLastColorUndefined: Self = StObject.set(x, "firstLastColor", js.undefined)
    
    inline def setIgnoreEmptyPoints(value: Boolean): Self = StObject.set(x, "ignoreEmptyPoints", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyPointsUndefined: Self = StObject.set(x, "ignoreEmptyPoints", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLossColor(value: String): Self = StObject.set(x, "lossColor", value.asInstanceOf[js.Any])
    
    inline def setLossColorUndefined: Self = StObject.set(x, "lossColor", js.undefined)
    
    inline def setMaxColor(value: String): Self = StObject.set(x, "maxColor", value.asInstanceOf[js.Any])
    
    inline def setMaxColorUndefined: Self = StObject.set(x, "maxColor", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinColor(value: String): Self = StObject.set(x, "minColor", value.asInstanceOf[js.Any])
    
    inline def setMinColorUndefined: Self = StObject.set(x, "minColor", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
    
    inline def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointSymbol(value: circle | cross | polygon | square | triangle): Self = StObject.set(x, "pointSymbol", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    inline def setShowFirstLast(value: Boolean): Self = StObject.set(x, "showFirstLast", value.asInstanceOf[js.Any])
    
    inline def setShowFirstLastUndefined: Self = StObject.set(x, "showFirstLast", js.undefined)
    
    inline def setShowMinMax(value: Boolean): Self = StObject.set(x, "showMinMax", value.asInstanceOf[js.Any])
    
    inline def setShowMinMaxUndefined: Self = StObject.set(x, "showMinMax", js.undefined)
    
    inline def setType(value: area | bar | line | spline | splinearea | steparea | stepline | winloss): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    inline def setWinColor(value: String): Self = StObject.set(x, "winColor", value.asInstanceOf[js.Any])
    
    inline def setWinColorUndefined: Self = StObject.set(x, "winColor", js.undefined)
    
    inline def setWinlossThreshold(value: Double): Self = StObject.set(x, "winlossThreshold", value.asInstanceOf[js.Any])
    
    inline def setWinlossThresholdUndefined: Self = StObject.set(x, "winlossThreshold", js.undefined)
  }
}
