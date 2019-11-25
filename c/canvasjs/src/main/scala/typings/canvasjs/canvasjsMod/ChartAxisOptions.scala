package typings.canvasjs.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisOptions extends js.Object {
  /**
    * Sets the color of Axis line. Axis line color can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "blue","#21AB13"..
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the dash type for axisY.
    * Default: "solid"
    */
  var lineDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Sets the Thickness of Axis line in pixels.
    * Default: 2
    * Example: 2, 4..
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * This property lets you set margin between chart’s boundary and Axis.
    * Default: 2
    * Example: 8, 10..
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum value permitted on Axis. Values greater than maximum are clipped. maximum also set the upper limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /**
    * Sets the minimum value of Axis. Values smaller than minimum are clipped. minimum also sets the lower limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var minimum: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Axis Title.
    * Default: null
    * Example: "Axis X Title"
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Color of Axis Title. The value of titleFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "#666666"
    * Example: "red", "#006400" .
    */
  var titleFontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Family of Axis Title.
    * Default: "arial"
    * Example: "calibri", "tahoma, "verdana" ..
    */
  var titleFontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Size of Axis Title in pixels.
    * Default: 20
    * Example: 16, 25 ..
    */
  var titleFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Font Style of Axis Title. It can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var titleFontStyle: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Weight used in the Axis Title. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var titleFontWeight: js.UndefOr[String] = js.undefined
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMaximum: js.UndefOr[Double] = js.undefined
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMinimum: js.UndefOr[Double] = js.undefined
}

object ChartAxisOptions {
  @scala.inline
  def apply(
    lineColor: String = null,
    lineDashType: DashType = null,
    lineThickness: Int | Double = null,
    margin: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    title: String = null,
    titleFontColor: String = null,
    titleFontFamily: String = null,
    titleFontSize: Int | Double = null,
    titleFontStyle: String = null,
    titleFontWeight: String = null,
    viewportMaximum: Int | Double = null,
    viewportMinimum: Int | Double = null
  ): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor.asInstanceOf[js.Any])
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (viewportMaximum != null) __obj.updateDynamic("viewportMaximum")(viewportMaximum.asInstanceOf[js.Any])
    if (viewportMinimum != null) __obj.updateDynamic("viewportMinimum")(viewportMinimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisOptions]
  }
}

