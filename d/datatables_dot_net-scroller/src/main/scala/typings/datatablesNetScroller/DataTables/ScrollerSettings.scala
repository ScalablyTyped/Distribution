package typings.datatablesNetScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerSettings extends js.Object {
  /*
    * Scroller uses the boundary scaling factor to decide when to redraw the table - which it
    * typically does before you reach the end of the currently loaded data set (in order to
    * allow the data to look continuous to a user scrolling through the data).
    */
  var boundaryScale: js.UndefOr[Double] = js.undefined
  /*
    * The display buffer is what Scroller uses to calculate how many rows it should pre-fetch
    * for scrolling.
    */
  var displayBuffer: js.UndefOr[Double] = js.undefined
  /*
    * Show (or not) the loading element in the background of the table. Note that you should
    * include the dataTables.scroller.css file for this to be displayed correctly.
    */
  var loadingIndicator: js.UndefOr[Boolean] = js.undefined
  /*
    * Scroller will attempt to automatically calculate the height of rows for it's internal
    * calculations. However the height that is used can be overridden using this parameter.
    */
  var rowHeight: js.UndefOr[Double | String] = js.undefined
  /*
    * When using server-side processing, Scroller will wait a small amount of time to allow
    * the scrolling to finish before requesting more data from the server.
    */
  var serverWait: js.UndefOr[Double] = js.undefined
  /*
    * Indicate if Scroller show show trace information on the console or not.
    */
  var trace: js.UndefOr[Boolean] = js.undefined
}

object ScrollerSettings {
  @scala.inline
  def apply(
    boundaryScale: js.UndefOr[Double] = js.undefined,
    displayBuffer: js.UndefOr[Double] = js.undefined,
    loadingIndicator: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Double | String = null,
    serverWait: js.UndefOr[Double] = js.undefined,
    trace: js.UndefOr[Boolean] = js.undefined
  ): ScrollerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boundaryScale)) __obj.updateDynamic("boundaryScale")(boundaryScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBuffer)) __obj.updateDynamic("displayBuffer")(displayBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingIndicator)) __obj.updateDynamic("loadingIndicator")(loadingIndicator.get.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(serverWait)) __obj.updateDynamic("serverWait")(serverWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerSettings]
  }
}

