package typings
package atBlueprintjsTableLib.atBlueprintjsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Grid")
@js.native
class Grid protected ()
  extends atBlueprintjsTableLib.libEsmCommonMod.Grid {
  /**
    * This constructor accumulates the heights and widths in `O(n)`, saving
    * time in later calculations.
    *
    * @param bleed - The number of rows/cols that we expand beyond the
    *     viewport (on all sides). This helps avoid displaying an empty
    *     viewport when the user scrolls quickly.
    */
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double]) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double, ghostHeight: scala.Double) = this()
  def this(rowHeights: js.Array[scala.Double], columnWidths: js.Array[scala.Double], bleed: scala.Double, ghostHeight: scala.Double, ghostWidth: scala.Double) = this()
}

/* static members */
@JSImport("@blueprintjs/table", "Grid")
@js.native
object Grid extends js.Object {
  var DEFAULT_BLEED: scala.Double = js.native
  var DEFAULT_GHOST_HEIGHT: scala.Double = js.native
  var DEFAULT_GHOST_WIDTH: scala.Double = js.native
  var DEFAULT_MAX_COLUMNS: scala.Double = js.native
  var DEFAULT_MAX_ROWS: scala.Double = js.native
}

