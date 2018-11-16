package typings
package datatablesDotNetDashScrollerLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollerMethods extends Api {
  /*
          * Calculate the row number that will be found at the given pixel position
          * (y-scroll).
          */
  def pixelsToRow(pixels: scala.Double): scala.Double = js.native
  /*
          * Calculate the row number that will be found at the given pixel position
          * (y-scroll).
          */
  def pixelsToRow(pixels: scala.Double, intParse: scala.Boolean): scala.Double = js.native
  /*
          * Calculate the row number that will be found at the given pixel position
          * (y-scroll).
          */
  def pixelsToRow(pixels: scala.Double, intParse: scala.Boolean, virtual: scala.Boolean): scala.Double = js.native
  /*
          * Calculate the pixel position from the top of the scrolling container for
          * a given row
          */
  def rowToPixels(rowIdx: scala.Double): scala.Double = js.native
  /*
          * Calculate the pixel position from the top of the scrolling container for
          * a given row
          */
  def rowToPixels(rowIdx: scala.Double, intParse: scala.Boolean): scala.Double = js.native
  /*
          * Calculate the pixel position from the top of the scrolling container for
          * a given row
          */
  def rowToPixels(rowIdx: scala.Double, intParse: scala.Boolean, virtual: scala.Boolean): scala.Double = js.native
  def scrollToRow(rowIdx: scala.Double): Api = js.native
  def scrollToRow(rowIdx: scala.Double, animate: scala.Boolean): Api = js.native
}

