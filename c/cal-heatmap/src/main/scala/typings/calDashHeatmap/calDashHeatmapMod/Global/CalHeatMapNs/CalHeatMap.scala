package typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalHeatMap extends js.Object {
  /**
  			 * Instead of replacing a date's value by a new one, increment it by the new value. All other dates are leaved untouched.
  			 * That's the one you want to use of you're populating the calendar in realtime!
  			 */
  var APPEND_ON_UPDATE: Double = js.native
  // Various update mode when using the update() API
  /** Reset the whole calendar data before inserting the new data. */
  var RESET_ALL_ON_UPDATE: Double = js.native
  /**
  			 * Update only the dates (subDomain) you pass in the data argument, replace their value by the new ones.
  			 * All other dates are leaved untouched.
  			 */
  var RESET_SINGLE_ON_UPDATE: Double = js.native
  var options: RuntimeOptions = js.native
  /**
  			 * Remove the calendar from the DOM
  			 * Remember to self-assign the result of destroy() to your calendar instance, or it'll lead to a memory leak.
  			 * @param {Function} callback function that will be executed when the calendar is removed from the DOM, at the end of the animation.
  			 * @returns always returns null.
  			 */
  def destroy(): typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs.CalHeatMap = js.native
  def destroy(callback: js.Function): typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs.CalHeatMap = js.native
  /**
  			 * Return the SVG source code with the appropriate CSS
  			 * The returned string code is valid and ready to be placed in a .svg file.
  			 * @returns SVG source code with the appropriate CSS.
  			 */
  def getSVG(): String = js.native
  /**
  			 * Change the highlighted dates.
  			 * Takes an array of Date object. Can also accepts the now string, equivalent to Date.now().
  			 * @param {string|Date|Date[]} dates The date or dates to highlight.
  			 */
  def highlight(dates: String): Unit = js.native
  def highlight(dates: js.Array[Date]): Unit = js.native
  def highlight(dates: Date): Unit = js.native
  /**
  			 * Initialise the CalHeatMap with the specified options
  			 * @param {InitOptions} options The CalHeatMap options
  			 */
  def init(): Unit = js.native
  def init(options: InitOptions): Unit = js.native
  /**
  			 * Jump the calendar to the specified date
  			 * This method will shift the calendar backward or forward, until the domain containing the specified date is visible.
  			 * @param {Date} date The date to jump to.
  			 * @param {boolean} reset Whether to set the domain with the specified as the calendar's first domain.
  			 */
  def jumpTo(date: Date): Unit = js.native
  def jumpTo(date: Date, reset: Boolean): Unit = js.native
  /**
  			 * Shift the calendar n domains forward
  			 * @param {number} n The number of domains to shift forward. The default is 1.
  			 */
  def next(): Unit = js.native
  def next(n: Double): Unit = js.native
  /**
  			 * Shift the calendar n domains back
  			 * @param {number} n The number of domains to shift back. The default is 1.
  			 */
  def previous(): Unit = js.native
  def previous(n: Double): Unit = js.native
  /**
  			 * Remove the legend from the calendar
  			 * Settings are kept and you can re-add the legend with the same settings using showLegend().
  			 */
  def removeLegend(): Unit = js.native
  /** Reset the calendar back to the start date */
  def rewind(): Unit = js.native
  /**
  			 * Change the legend settings and/or threshold
  			 * When called without arguments, setLegend() will just redraw the legend.
  			 * @param {} legend Same as legend : an array of thresholds
  			 * @param {} legendColor Same as legendColors : an object with the heatmap's colors, or an array of 2 colors
  			 */
  def setLegend(): Unit = js.native
  def setLegend(legend: js.Array[Double]): Unit = js.native
  def setLegend(legend: js.Array[Double], legendColors: js.Array[String]): Unit = js.native
  def setLegend(legend: js.Array[Double], legendColors: LegendColor): Unit = js.native
  /** Display the legend, if not already shown. */
  def showLegend(): Unit = js.native
  /**
  			 * Update the calendar with new data
  			 * Use update() when you want to refresh the calendar with a new set of data.
  			 * Particularly useful if you're filling the calendar in realtime, or if you want to display a subset of the current data.
  			 * @param {string|Object} data Accept the same format as the data option.
  			 * @param {} afterLoad Whether to execute the afterLoad() callback to convert your data into the json object, expected by cal-heatmap.
  			 *                     It can also directly takes a function, in case your data can not be converted with the afterLoad() function you defined.
  			 * @param {} updateMode Define how to insert the new data into the calendar.
  			 *                      Accepted values are:
  			 *                        Instance.RESET_ALL_ON_UPDATE  (default) Reset the whole calendar data before inserting the new data.
  			 *                        Instance.RESET_SINGLE_ON_UPDATE  Update only the dates (subDomain) you pass in the data argument,
  			 *                                                         replace their value by the new ones. All other dates are leaved untouched.
  			 *                        Instance.APPEND_ON_UPDATE  Instead of replacing a date's value by a new one, increment it by the new value.
  			 *                                                   All other dates are leaved untouched. That's the one you want to use of you're
  			 *                                                   populating the calendar in realtime!
  			 */
  def update(data: String): Unit = js.native
  def update(data: String, afterLoad: js.Function): Unit = js.native
  def update(data: String, afterLoad: js.Function, updateMode: Double): Unit = js.native
  def update(data: String, afterLoad: Boolean): Unit = js.native
  def update(data: String, afterLoad: Boolean, updateMode: Double): Unit = js.native
  def update(data: js.Object): Unit = js.native
  def update(data: js.Object, afterLoad: js.Function): Unit = js.native
  def update(data: js.Object, afterLoad: js.Function, updateMode: Double): Unit = js.native
  def update(data: js.Object, afterLoad: Boolean): Unit = js.native
  def update(data: js.Object, afterLoad: Boolean, updateMode: Double): Unit = js.native
}

