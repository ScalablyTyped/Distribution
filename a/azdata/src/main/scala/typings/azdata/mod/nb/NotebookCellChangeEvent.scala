package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCellChangeEvent extends StObject {
  
  /**
    * The new value for the {@link NotebookDocument.cells}.
    */
  var cells: js.Array[NotebookCell]
  
  /**
    * The {@link NotebookChangeKind} which has triggered this
    * event. Can be `undefined`.
    */
  var kind: js.UndefOr[NotebookChangeKind] = js.undefined
  
  /**
    * The {@link NotebookDocument} for which the selections have changed.
    */
  var notebook: NotebookDocument
}
object NotebookCellChangeEvent {
  
  inline def apply(cells: js.Array[NotebookCell], notebook: NotebookDocument): NotebookCellChangeEvent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookCellChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setKind(value: NotebookChangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotebook(value: NotebookDocument): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
