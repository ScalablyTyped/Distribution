package typings.blueprintjsTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Grid")
@js.native
open class Grid protected ()
  extends typings.blueprintjsTable.libEsmCommonMod.Grid {
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
  def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
  def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Unit, ghostHeight: Double) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Double,
    ghostHeight: Double,
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Double,
    ghostHeight: Unit,
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Unit,
    ghostHeight: Double,
    ghostWidth: Double
  ) = this()
  def this(
    rowHeights: js.Array[Double],
    columnWidths: js.Array[Double],
    bleed: Unit,
    ghostHeight: Unit,
    ghostWidth: Double
  ) = this()
}
/* static members */
object Grid {
  
  @JSImport("@blueprintjs/table", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Grid.DEFAULT_BLEED")
  @js.native
  def DEFAULT_BLEED: Double = js.native
  inline def DEFAULT_BLEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BLEED")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.DEFAULT_GHOST_HEIGHT")
  @js.native
  def DEFAULT_GHOST_HEIGHT: Double = js.native
  inline def DEFAULT_GHOST_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_HEIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.DEFAULT_GHOST_WIDTH")
  @js.native
  def DEFAULT_GHOST_WIDTH: Double = js.native
  inline def DEFAULT_GHOST_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_WIDTH")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.DEFAULT_MAX_COLUMNS")
  @js.native
  def DEFAULT_MAX_COLUMNS: Double = js.native
  inline def DEFAULT_MAX_COLUMNS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_COLUMNS")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.DEFAULT_MAX_ROWS")
  @js.native
  def DEFAULT_MAX_ROWS: Double = js.native
  inline def DEFAULT_MAX_ROWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_ROWS")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.MIN_COLUMN_HEADER_HEIGHT")
  @js.native
  def MIN_COLUMN_HEADER_HEIGHT: Double = js.native
  inline def MIN_COLUMN_HEADER_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_COLUMN_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Grid.MIN_ROW_HEADER_WIDTH")
  @js.native
  def MIN_ROW_HEADER_WIDTH: Double = js.native
  inline def MIN_ROW_HEADER_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_ROW_HEADER_WIDTH")(x.asInstanceOf[js.Any])
}
