package typings.blueprintjsTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Grid")
@js.native
class Grid protected ()
  extends typings.blueprintjsTable.commonMod.Grid {
  /**
    * This constructor accumulates the heights and widths in `O(n)`, saving
    * time in later calculations.
    *
    * @param bleed - The number of rows/cols that we expand beyond the
    *     viewport (on all sides). This helps avoid displaying an empty
    *     viewport when the user scrolls quickly.
    */
  def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double]) = this()
  def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: js.UndefOr[scala.Nothing],
    ghostHeight: Double
  ) = this()
  def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: js.UndefOr[scala.Nothing],
    ghostHeight: js.UndefOr[scala.Nothing],
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: js.UndefOr[scala.Nothing],
    ghostHeight: Double,
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Double,
    ghostHeight: js.UndefOr[scala.Nothing],
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Double,
    ghostHeight: Double,
    ghostWidth: Double
  ) = this()
}
/* static members */
@JSImport("@blueprintjs/table", "Grid")
@js.native
object Grid extends js.Object {
  
  var DEFAULT_BLEED: Double = js.native
  
  var DEFAULT_GHOST_HEIGHT: Double = js.native
  
  var DEFAULT_GHOST_WIDTH: Double = js.native
  
  var DEFAULT_MAX_COLUMNS: Double = js.native
  
  var DEFAULT_MAX_ROWS: Double = js.native
}
