package typings.chartist.mod

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
  implicit class IPieChartOptionsOps[Self <: IPieChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChartPadding(value: IChartPadding | Double): Self = this.set("chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartPadding: Self = this.set("chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: IPieChartClasses): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setDonut(value: Boolean): Self = this.set("donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    
    @scala.inline
    def setDonutSolid(value: Boolean): Self = this.set("donutSolid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonutSolid: Self = this.set("donutSolid", js.undefined)
    
    @scala.inline
    def setDonutWidth(value: Double | String): Self = this.set("donutWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonutWidth: Self = this.set("donutWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyValues(value: Boolean): Self = this.set("ignoreEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptyValues: Self = this.set("ignoreEmptyValues", js.undefined)
    
    @scala.inline
    def setLabelDirection(value: String): Self = this.set("labelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDirection: Self = this.set("labelDirection", js.undefined)
    
    @scala.inline
    def setLabelInterpolationFnc(value: js.Function): Self = this.set("labelInterpolationFnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInterpolationFnc: Self = this.set("labelInterpolationFnc", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: Double): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
