package typings.azdata.mod.nb

import typings.azdata.anon.UndoStopAfter
import typings.vscode.Thenable
import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookEditor extends js.Object {
  /**
    * The document associated with this editor. The document will be the same for the entire lifetime of this editor.
    */
  val document: NotebookDocument = js.native
  /**
    * The column in which this editor shows. Will be `undefined` in case this
    * isn't one of the main editors, e.g an embedded editor, or when the editor
    * column is larger than three.
    */
  var viewColumn: js.UndefOr[ViewColumn] = js.native
  /**
    * Changes the Notebook's kernel. Thenable will resolve only after kernel change is complete.
    */
  def changeKernel(kernel: IKernelSpec): Thenable[Boolean] = js.native
  /**
    * Clears the outputs of all code cells in a Notebook
    * @return A promise that resolves with a value indicating if the outputs are cleared or not.
    */
  def clearAllOutputs(): Thenable[Boolean] = js.native
  /**
    * Clears the outputs of the active code cell in a notebook.
    */
  def clearOutput(): Thenable[Boolean] = js.native
  def clearOutput(cell: NotebookCell): Thenable[Boolean] = js.native
  /**
    * Perform an edit on the document associated with this notebook editor.
    *
    * The given callback-function is invoked with an [edit-builder](#NotebookEditorEdit) which must
    * be used to make edits. Note that the edit-builder is only valid while the
    * callback executes.
    *
    * @param callback A function which can create edits using an [edit-builder](#NotebookEditorEdit).
    * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
    * @return A promise that resolves with a value indicating if the edits could be applied.
    */
  def edit(callback: js.Function1[/* editBuilder */ NotebookEditorEdit, Unit]): Thenable[Boolean] = js.native
  def edit(callback: js.Function1[/* editBuilder */ NotebookEditorEdit, Unit], options: UndoStopAfter): Thenable[Boolean] = js.native
  /**
    * Kicks off execution of all code cells. Thenable will resolve only when full execution of all cells is completed.
    */
  def runAllCells(): Thenable[Boolean] = js.native
  def runAllCells(startCell: NotebookCell): Thenable[Boolean] = js.native
  def runAllCells(startCell: NotebookCell, endCell: NotebookCell): Thenable[Boolean] = js.native
  /**
    * Kicks off execution of a cell. Thenable will resolve only once the full execution is completed.
    *
    *
    * @param cell An optional cell in this notebook which should be executed. If no cell is defined, it will run the active cell instead
    * @return A promise that resolves with a value indicating if the cell was run or not.
    */
  def runCell(): Thenable[Boolean] = js.native
  def runCell(cell: NotebookCell): Thenable[Boolean] = js.native
}

