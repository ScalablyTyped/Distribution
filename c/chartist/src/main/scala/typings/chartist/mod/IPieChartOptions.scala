package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPieChartOptions extends IChartOptions {
  
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | Double] = js.native
  
  /**
    * Override the class names that are used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[IPieChartClasses] = js.native
  
  /**
    * If specified the donut CSS classes will be used and strokes will be drawn instead of pie slices.
    */
  var donut: js.UndefOr[Boolean] = js.native
  
  /**
    * If specified the donut segments will be drawn as shapes instead of strokes.
    */
  var donutSolid: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the donut stroke width, currently done in javascript for convenience. May move to CSS styles in the future.
    * This option can be set as number or string to specify a relative width (i.e. 100 or '30%').
    */
  var donutWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * If true empty values will be ignored to avoid drawing unncessary slices and labels
    */
  var ignoreEmptyValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Label direction can be 'neutral', 'explode' or 'implode'.  Default is 'neutral'.  The labels anchor will be positioned based on those settings as well as the fact if the labels are on the right or left side of the center of the chart. Usually explode is useful when labels are positioned far away from the center.
    */
  var labelDirection: js.UndefOr[String] = js.native
  
  /**
    * An interpolation function for the label value
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  
  /**
    * Label position offset from the standard position which is half distance of the radius. This value can be either positive or negative. Positive values will position the label away from the center.
    */
  var labelOffset: js.UndefOr[Double] = js.native
  
  /**
    * This option can be set to 'inside', 'outside' or 'center'. Positioned with 'inside' the labels will be placed on half the distance of the radius to the border of the Pie by respecting the 'labelOffset'. The 'outside' option will place the labels at the border of the pie and 'center' will place the labels in the absolute center point of the chart. The 'center' option only makes sense in conjunction with the 'labelOffset' option.
    */
  var labelPosition: js.UndefOr[String] = js.native
  
  /**
    * Specify if a label should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * The start angle of the pie chart in degrees where 0 points north. A higher value offsets the start angle clockwise.
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /**
    * An optional total you can specify. By specifying a total value, the sum of the values in the series must be this total in order to draw a full pie. You can use this parameter to draw only parts of a pie or gauge charts.
    */
  var total: js.UndefOr[Double] = js.native
  
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IPieChartOptions {
  
  @scala.inline
  def apply(): IPieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChartOptions]
  }
  
  @scala.inline
  implicit class IPieChartOptionsMutableBuilder[Self <: IPieChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartPadding(value: IChartPadding | Double): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: IPieChartClasses): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setDonut(value: Boolean): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutSolid(value: Boolean): Self = StObject.set(x, "donutSolid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutSolidUndefined: Self = StObject.set(x, "donutSolid", js.undefined)
    
    @scala.inline
    def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    @scala.inline
    def setDonutWidth(value: Double | String): Self = StObject.set(x, "donutWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutWidthUndefined: Self = StObject.set(x, "donutWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyValues(value: Boolean): Self = StObject.set(x, "ignoreEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreEmptyValuesUndefined: Self = StObject.set(x, "ignoreEmptyValues", js.undefined)
    
    @scala.inline
    def setLabelDirection(value: String): Self = StObject.set(x, "labelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDirectionUndefined: Self = StObject.set(x, "labelDirection", js.undefined)
    
    @scala.inline
    def setLabelInterpolationFnc(value: js.Function): Self = StObject.set(x, "labelInterpolationFnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
