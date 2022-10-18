package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Changes to the editor state are grouped into transactions.
Typically, a user action creates a single transaction, which may
contain any number of document changes, may change the selection,
or have other effects. Create a transaction by calling
[`EditorState.update`](https://codemirror.net/6/docs/ref/#state.EditorState.update), or immediately
dispatch one by calling
[`EditorView.dispatch`](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch).
*/
@js.native
trait Transaction extends StObject {
  
  /**
    Get the value of the given annotation type, if any.
    */
  def annotation[T](`type`: AnnotationType[T]): js.UndefOr[T] = js.native
  
  /**
    The document changes made by this transaction.
    */
  val changes: ChangeSet = js.native
  
  /**
    Indicates whether the transaction changed the document.
    */
  def docChanged: Boolean = js.native
  
  /**
    The effects added to the transaction.
    */
  val effects: js.Array[StateEffect[Any]] = js.native
  
  /**
    Returns true if the transaction has a [user
    event](https://codemirror.net/6/docs/ref/#state.Transaction^userEvent) annotation that is equal to
    or more specific than `event`. For example, if the transaction
    has `"select.pointer"` as user event, `"select"` and
    `"select.pointer"` will match it.
    */
  def isUserEvent(event: String): Boolean = js.native
  
  /**
    The new document produced by the transaction. Contrary to
    [`.state`](https://codemirror.net/6/docs/ref/#state.Transaction.state)`.doc`, accessing this won't
    force the entire new state to be computed right away, so it is
    recommended that [transaction
    filters](https://codemirror.net/6/docs/ref/#state.EditorState^transactionFilter) use this getter
    when they need to look at the new document.
    */
  def newDoc: Text = js.native
  
  /**
    The new selection produced by the transaction. If
    [`this.selection`](https://codemirror.net/6/docs/ref/#state.Transaction.selection) is undefined,
    this will [map](https://codemirror.net/6/docs/ref/#state.EditorSelection.map) the start state's
    current selection through the changes made by the transaction.
    */
  def newSelection: EditorSelection = js.native
  
  /**
    Indicates whether this transaction reconfigures the state
    (through a [configuration compartment](https://codemirror.net/6/docs/ref/#state.Compartment) or
    with a top-level configuration
    [effect](https://codemirror.net/6/docs/ref/#state.StateEffect^reconfigure).
    */
  def reconfigured: Boolean = js.native
  
  /**
    Whether the selection should be scrolled into view after this
    transaction is dispatched.
    */
  val scrollIntoView: Boolean = js.native
  
  /**
    The selection set by this transaction, or undefined if it
    doesn't explicitly set a selection.
    */
  val selection: js.UndefOr[EditorSelection] = js.native
  
  /**
    The state from which the transaction starts.
    */
  val startState: EditorState = js.native
  
  /**
    The new state created by the transaction. Computed on demand
    (but retained for subsequent access), so it is recommended not to
    access it in [transaction
    filters](https://codemirror.net/6/docs/ref/#state.EditorState^transactionFilter) when possible.
    */
  def state: EditorState = js.native
}
