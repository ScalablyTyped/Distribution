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
@JSImport("@codemirror/state", "Transaction")
@js.native
/* private */ open class Transaction () extends StObject {
  
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
object Transaction {
  
  @JSImport("@codemirror/state", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Annotation indicating whether a transaction should be added to
    the undo history or not.
    */
  /* static member */
  @JSImport("@codemirror/state", "Transaction.addToHistory")
  @js.native
  def addToHistory: AnnotationType[Boolean] = js.native
  inline def addToHistory_=(x: AnnotationType[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addToHistory")(x.asInstanceOf[js.Any])
  
  /**
    Annotation indicating (when present and true) that a transaction
    represents a change made by some other actor, not the user. This
    is used, for example, to tag other people's changes in
    collaborative editing.
    */
  /* static member */
  @JSImport("@codemirror/state", "Transaction.remote")
  @js.native
  def remote: AnnotationType[Boolean] = js.native
  inline def remote_=(x: AnnotationType[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remote")(x.asInstanceOf[js.Any])
  
  /**
    Annotation used to store transaction timestamps. Automatically
    added to every transaction, holding `Date.now()`.
    */
  /* static member */
  @JSImport("@codemirror/state", "Transaction.time")
  @js.native
  def time: AnnotationType[Double] = js.native
  inline def time_=(x: AnnotationType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  /**
    Annotation used to associate a transaction with a user interface
    event. Holds a string identifying the event, using a
    dot-separated format to support attaching more specific
    information. The events used by the core libraries are:
    
    - `"input"` when content is entered
    - `"input.type"` for typed input
    - `"input.type.compose"` for composition
    - `"input.paste"` for pasted input
    - `"input.drop"` when adding content with drag-and-drop
    - `"input.complete"` when autocompleting
    - `"delete"` when the user deletes content
    - `"delete.selection"` when deleting the selection
    - `"delete.forward"` when deleting forward from the selection
    - `"delete.backward"` when deleting backward from the selection
    - `"delete.cut"` when cutting to the clipboard
    - `"move"` when content is moved
    - `"move.drop"` when content is moved within the editor through drag-and-drop
    - `"select"` when explicitly changing the selection
    - `"select.pointer"` when selecting with a mouse or other pointing device
    - `"undo"` and `"redo"` for history actions
    
    Use [`isUserEvent`](https://codemirror.net/6/docs/ref/#state.Transaction.isUserEvent) to check
    whether the annotation matches a given event.
    */
  /* static member */
  @JSImport("@codemirror/state", "Transaction.userEvent")
  @js.native
  def userEvent: AnnotationType[String] = js.native
  inline def userEvent_=(x: AnnotationType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userEvent")(x.asInstanceOf[js.Any])
}
