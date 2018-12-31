package typings
package datatablesDotNetDashScrollerLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerSettings extends js.Object {
  /*
    * Scroller uses the boundary scaling factor to decide when to redraw the table - which it
    * typically does before you reach the end of the currently loaded data set (in order to
    * allow the data to look continuous to a user scrolling through the data).
    */
  var boundaryScale: js.UndefOr[scala.Double] = js.undefined
  /*
    * The display buffer is what Scroller uses to calculate how many rows it should pre-fetch
    * for scrolling.
    */
  var displayBuffer: js.UndefOr[scala.Double] = js.undefined
  /*
    * Show (or not) the loading element in the background of the table. Note that you should
    * include the dataTables.scroller.css file for this to be displayed correctly.
    */
  var loadingIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Scroller will attempt to automatically calculate the height of rows for it's internal
    * calculations. However the height that is used can be overridden using this parameter.
    */
  var rowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /*
    * When using server-side processing, Scroller will wait a small amount of time to allow
    * the scrolling to finish before requesting more data from the server.
    */
  var serverWait: js.UndefOr[scala.Double] = js.undefined
  /*
    * Indicate if Scroller show show trace information on the console or not.
    */
  var trace: js.UndefOr[scala.Boolean] = js.undefined
}

