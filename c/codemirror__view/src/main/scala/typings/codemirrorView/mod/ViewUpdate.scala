package typings.codemirrorView.mod

import typings.codemirrorState.mod.ChangeSet
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
View [plugins](https://codemirror.net/6/docs/ref/#view.ViewPlugin) are given instances of this
class, which describe what happened, whenever the view is updated.
*/
@JSImport("@codemirror/view", "ViewUpdate")
@js.native
/* private */ open class ViewUpdate () extends StObject {
  
  /**
    The changes made to the document by this update.
    */
  val changes: ChangeSet = js.native
  
  /**
    Whether the document changed in this update.
    */
  def docChanged: Boolean = js.native
  
  /**
    True when this update indicates a focus change.
    */
  def focusChanged: Boolean = js.native
  
  /**
    Returns true when the document was modified or the size of the
    editor, or elements within the editor, changed.
    */
  def geometryChanged: Boolean = js.native
  
  /**
    Indicates whether the height of a block element in the editor
    changed in this update.
    */
  def heightChanged: Boolean = js.native
  
  /**
    Whether the selection was explicitly set in this update.
    */
  def selectionSet: Boolean = js.native
  
  /**
    The previous editor state.
    */
  val startState: EditorState = js.native
  
  /**
    The new editor state.
    */
  val state: EditorState = js.native
  
  /**
    The transactions involved in the update. May be empty.
    */
  val transactions: js.Array[Transaction] = js.native
  
  /**
    The editor view that the update is associated with.
    */
  val view: EditorView = js.native
  
  /**
    Tells you whether the [viewport](https://codemirror.net/6/docs/ref/#view.EditorView.viewport) or
    [visible ranges](https://codemirror.net/6/docs/ref/#view.EditorView.visibleRanges) changed in this
    update.
    */
  def viewportChanged: Boolean = js.native
}
