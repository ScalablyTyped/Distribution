package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartDataPoint extends ChartDataCommon {
  /**
           * Sets the exploded value of dataPoint. It is applicable only in case of Pie and Doughnut Charts. This property causes the Pie/Doughnut slice to separate out.
           * Default: true
           * Example: true, false
           */
  var exploded: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Sets label value of a dataPoint. The value appears next to the dataPoint on axisX Line. If not provided, it takes x value for label.
           * Default: x value
           * Example: "label1", "label2"..
           */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the x value. It determines the position of the dataPoint on X Axis. It can be numeric or a dateTime value. Values can be positive or Negative.
           * If no x value is provided, they are automatically set sequentially starting from zero
           * Default: null
           * Example: 10, 20, 30 ..
           * new Date(2011, 08, 01)
           */
  var x: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
           * Sets the y value of dataPoint. It determines the position of dataPoint on Y Axis. Values can be positive or Negative
           * Default: null
           * Example: 5, 20, -30 ..
           */
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * Sets the z value of dataPoint. It is only applicable in case of Bubble chart. This value determines the size of the bubble.
           * Default: 1
           * Example: 10, 20, 35..
           */
  var z: js.UndefOr[scala.Double] = js.undefined
}

