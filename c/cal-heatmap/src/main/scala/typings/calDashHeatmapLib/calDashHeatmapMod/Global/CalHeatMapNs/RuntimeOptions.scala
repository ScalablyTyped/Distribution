package typings
package calDashHeatmapLib.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RuntimeOptions extends InitOptions {
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[scala.Double]
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[stdLib.Date]
  /**
  			 * Name of the items to represent in the calendar.
  			 * First index is singular form, and the second index, the plural form.
  			 */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[java.lang.String]
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[scala.Double]
}

