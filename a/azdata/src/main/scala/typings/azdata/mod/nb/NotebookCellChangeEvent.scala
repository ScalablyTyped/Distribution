package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookCellChangeEvent extends js.Object {
  
  /**
    * The new value for the [notebook document's cells](#NotebookDocument.cells).
    */
  var cells: js.Array[NotebookCell] = js.native
  
  /**
    * The [change kind](#NotebookChangeKind) which has triggered this
    * event. Can be `undefined`.
    */
  var kind: js.UndefOr[NotebookChangeKind] = js.native
  
  /**
    * The [notebook document](#NotebookDocument) for which the selections have changed.
    */
  var notebook: NotebookDocument = js.native
}
object NotebookCellChangeEvent {
  
  @scala.inline
  def apply(cells: js.Array[NotebookCell], notebook: NotebookDocument): NotebookCellChangeEvent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellChangeEvent]
  }
  
  @scala.inline
  implicit class NotebookCellChangeEventOps[Self <: NotebookCellChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellsVarargs(value: NotebookCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[NotebookCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebook(value: NotebookDocument): Self = this.set("notebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: NotebookChangeKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
