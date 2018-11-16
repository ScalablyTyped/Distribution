package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartAxisOptions extends js.Object {
  /**
           * Sets the color of Axis line. Axis line color can be a "HTML Color Name" or "hex" code .
           * Default: "#BBBBBB"
           * Example: "blue","#21AB13"..
           */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the dash type for axisY.
           * Default: "solid"
           */
  var lineDashType: js.UndefOr[canvasjsLib.DashType] = js.undefined
  /**
           * Sets the Thickness of Axis line in pixels.
           * Default: 2
           * Example: 2, 4..
           */
  var lineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
           * This property lets you set margin between chart’s boundary and Axis.
           * Default: 2
           * Example: 8, 10..
           */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the maximum value permitted on Axis. Values greater than maximum are clipped. maximum also set the upper limit while panning chart.
           * Default: Automatically Calculated based on the data.
           * Example: 100, 350..
           */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the minimum value of Axis. Values smaller than minimum are clipped. minimum also sets the lower limit while panning chart.
           * Default: Automatically Calculated based on the data.
           * Example: 100, 350..
           */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the Axis Title.
           * Default: null
           * Example: "Axis X Title"
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Color of Axis Title. The value of titleFontColor can be a "HTML Color Name" or "hex" code .
           * Default: "#666666"
           * Example: "red", "#006400" .
           */
  var titleFontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Family of Axis Title.
           * Default: "arial"
           * Example: "calibri", "tahoma, "verdana" ..
           */
  var titleFontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Size of Axis Title in pixels.
           * Default: 20
           * Example: 16, 25 ..
           */
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the Font Style of Axis Title. It can be set to one of the below options.
           * Default: "normal"
           * Options: "normal", "italic" , "oblique"
           */
  var titleFontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Weight used in the Axis Title. It can be set to one of the options below.
           * Default: "normal"
           * Options: "lighter", "normal", "bold" , "bolder"
           */
  var titleFontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
           * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
           * Default: Automatically Calculated based on the data.
           * Example: -100, 350..
           */
  var viewportMaximum: js.UndefOr[scala.Double] = js.undefined
  /**
           * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
           * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
           * Default: Automatically Calculated based on the data.
           * Example: -100, 350..
           */
  var viewportMinimum: js.UndefOr[scala.Double] = js.undefined
}

