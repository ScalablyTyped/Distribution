package typings
package datatablesDotNetDashScrollerLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollerMethodsModel extends js.Object {
  /*
          * Calculate and store information about how many rows are to be displayed
          * in the scrolling viewport, based on current dimensions in the browser's
          * rendering.
          */
  def measure(): Api = js.native
  /*
          * Calculate and store information about how many rows are to be displayed
          * in the scrolling viewport, based on current dimensions in the browser's
          * rendering.
          */
  def measure(redraw: scala.Boolean): Api = js.native
  /*
          * Get information about current displayed record range.
          */
  def page(): PageInfo = js.native
  /*
          * Get Scroller Api
          */
  def scroller(): ScrollerMethods = js.native
}

