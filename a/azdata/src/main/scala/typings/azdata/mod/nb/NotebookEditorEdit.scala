package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookEditorEdit extends js.Object {
  /**
    * Delete a certain cell.
    *
    * @param index The index of the cell to remove.
    */
  def deleteCell(index: Double): Unit = js.native
  /**
    * Insert a cell (optionally) at a specific index. Any index outside of the length of the cells
    * will result in the cell being added at the end.
    *
    * @param index The position where the new text should be inserted.
    * @param value The new text this operation should insert.
    * @param collapsed The collapsed state of the new cell. Default value is `false` if not provided.
    */
  def insertCell(value: ICellContents): Unit = js.native
  def insertCell(value: ICellContents, index: js.UndefOr[scala.Nothing], collapsed: Boolean): Unit = js.native
  def insertCell(value: ICellContents, index: Double): Unit = js.native
  def insertCell(value: ICellContents, index: Double, collapsed: Boolean): Unit = js.native
  /**
    * Replace a cell range with a new cell.
    *
    * @param location The range this operation should remove.
    * @param value The new cell this operation should insert after removing `location`.
    */
  def replace(location: Double, value: ICellContents): Unit = js.native
  def replace(location: CellRange, value: ICellContents): Unit = js.native
}

