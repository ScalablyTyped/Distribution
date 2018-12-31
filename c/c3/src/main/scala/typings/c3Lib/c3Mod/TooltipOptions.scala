package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /**
    * Set custom HTML for the tooltip.
    * Specified function receives data, defaultTitleFormat, defaultValueFormat and color of the data point to show. If tooltip.grouped is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* defaultTitleFormat */ java.lang.String, 
      /* defaultValueFormat */ java.lang.String, 
      /* color */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  var format: js.UndefOr[c3Lib.Anon_Value] = js.undefined
  /**
    * Set if tooltip is grouped or not for the data points.
    */
  var grouped: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set tooltip values order
    * Available Values: desc, asc, any[], function (data1, data2) { ... }, null
    */
  var order: js.UndefOr[
    java.lang.String | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, scala.Double]) | scala.Null
  ] = js.undefined
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* element */ js.Any, 
      c3Lib.Anon_Top
    ]
  ] = js.undefined
  /**
    * Show or hide tooltip.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

