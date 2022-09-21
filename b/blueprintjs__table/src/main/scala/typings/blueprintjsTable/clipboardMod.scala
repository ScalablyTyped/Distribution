package typings.blueprintjsTable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object Clipboard {
    
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Overrides the inherited CSS of the element to make sure it is
      * selectable. This method also makes the element pseudo-invisible.
      *
      * @deprecated will be removed in v4.0
      */
    inline def applySelectableStyles(elem: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("applySelectableStyles")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align.
      *
      * @returns a Promise which resolves or rejects if the copy succeeds.
      *
      * See `Clipboard.copy`
      */
    inline def copyCells(cells: js.Array[js.Array[String]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyCells")(cells.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Copies the text to the clipboard.
      *
      * @returns a Promise which resolves or rejects if the copy succeeds.
      */
    inline def copyString(value: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
