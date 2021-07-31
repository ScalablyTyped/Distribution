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
      */
    @scala.inline
    def applySelectableStyles(elem: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("applySelectableStyles")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align. Returns a boolean indicating whether the
      * copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @scala.inline
    def copyCells(cells: js.Array[js.Array[String]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("copyCells")(cells.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Copies the element and its children to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * If a plaintext argument is supplied, we add both the text/html and
      * text/plain mime types to the clipboard. This preserves the built in
      * semantics of copying elements to the clipboard while allowing custom
      * plaintext output for programs that can't cope with HTML data in the
      * clipboard.
      *
      * Verified on Firefox 47, Chrome 51.
      *
      * Note: Sometimes the copy does not succeed. Presumably, in order to
      * prevent memory issues, browsers will limit the total amount of data you
      * can copy to the clipboard. Based on ad hoc testing, we found an
      * inconsistent limit at about 300KB or 40,000 cells. Depending on the on
      * the content of cells, your limits may vary.
      */
    @scala.inline
    def copyElement(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def copyElement(elem: HTMLElement, plaintext: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copies the text to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @scala.inline
    def copyString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("copyString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a boolean indicating whether the current browser nominally
      * supports the `copy` operation using the `execCommand` API.
      */
    @scala.inline
    def isCopySupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCopySupported")().asInstanceOf[Boolean]
  }
}
