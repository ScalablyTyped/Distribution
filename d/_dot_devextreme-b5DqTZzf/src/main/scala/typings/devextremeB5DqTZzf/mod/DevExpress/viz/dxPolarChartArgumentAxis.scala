package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allArgumentPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.continuous
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.datetime
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.discrete
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.logarithmic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.numeric
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxis
  extends StObject
     with dxPolarChartCommonAxisSettings {
  
  /**
    * Specifies the desired type of axis values.
    */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  
  /**
    * Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the &apos;continuous&apos; and &apos;logarithmic&apos; types.
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the order of categories on an axis of the &apos;discrete&apos; type.
    */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  
  /**
    * Defines an array of the argument axis constant lines.
    */
  var constantLines: js.UndefOr[js.Array[dxPolarChartArgumentAxisConstantLines]] = js.undefined
  
  /**
    * Specifies whether or not to display the first point at the angle specified by the startAngle property.
    */
  var firstPointOnStartAngle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the elements that will be highlighted when the argument axis is hovered over.
    */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.undefined
  
  /**
    * Specifies properties for argument axis labels.
    */
  @JSName("label")
  var label_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisLabel] = js.undefined
  
  /**
    * Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes.
    */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for a logarithmic axis.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the number of minor ticks between two neighboring major ticks.
    */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the interval between minor ticks.
    */
  var minorTickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the properties of the minor ticks.
    */
  @JSName("minorTick")
  var minorTick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisMinorTick] = js.undefined
  
  /**
    * Specifies the value to be used as the origin for the argument axis.
    */
  var originValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the period of the argument values in the data source.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the angle in arc degrees to which the argument axis should be rotated. The positive values rotate the axis clockwise.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies properties for argument axis strips.
    */
  var strips: js.UndefOr[js.Array[dxPolarChartArgumentAxisStrips]] = js.undefined
  
  /**
    * Specifies an interval between axis ticks/grid lines.
    */
  var tickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * An object defining the configuration properties for axis ticks.
    */
  @JSName("tick")
  var tick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisTick] = js.undefined
  
  /**
    * Specifies the required type of the argument axis.
    */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
}
object dxPolarChartArgumentAxis {
  
  inline def apply(): dxPolarChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxis]
  }
  
  extension [Self <: dxPolarChartArgumentAxis](x: Self) {
    
    inline def setArgumentType(value: datetime | numeric | string_): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setArgumentTypeUndefined: Self = StObject.set(x, "argumentType", js.undefined)
    
    inline def setAxisDivisionFactor(value: Double): Self = StObject.set(x, "axisDivisionFactor", value.asInstanceOf[js.Any])
    
    inline def setAxisDivisionFactorUndefined: Self = StObject.set(x, "axisDivisionFactor", js.undefined)
    
    inline def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setConstantLines(value: js.Array[dxPolarChartArgumentAxisConstantLines]): Self = StObject.set(x, "constantLines", value.asInstanceOf[js.Any])
    
    inline def setConstantLinesUndefined: Self = StObject.set(x, "constantLines", js.undefined)
    
    inline def setConstantLinesVarargs(value: dxPolarChartArgumentAxisConstantLines*): Self = StObject.set(x, "constantLines", js.Array(value*))
    
    inline def setFirstPointOnStartAngle(value: Boolean): Self = StObject.set(x, "firstPointOnStartAngle", value.asInstanceOf[js.Any])
    
    inline def setFirstPointOnStartAngleUndefined: Self = StObject.set(x, "firstPointOnStartAngle", js.undefined)
    
    inline def setHoverMode(value: allArgumentPoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxPolarChartArgumentAxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMinorTick(value: dxPolarChartArgumentAxisMinorTick): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(value: VizTimeInterval): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setOriginValue(value: Double): Self = StObject.set(x, "originValue", value.asInstanceOf[js.Any])
    
    inline def setOriginValueUndefined: Self = StObject.set(x, "originValue", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStrips(value: js.Array[dxPolarChartArgumentAxisStrips]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: dxPolarChartArgumentAxisStrips*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setTick(value: dxPolarChartArgumentAxisTick): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(value: VizTimeInterval): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: continuous | discrete | logarithmic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
