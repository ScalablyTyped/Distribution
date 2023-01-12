package typings.codemirrorState.mod

import typings.codemirrorState.anon.Anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Describes a [transaction](https://codemirror.net/6/docs/ref/#state.Transaction) when calling the
[`EditorState.update`](https://codemirror.net/6/docs/ref/#state.EditorState.update) method.
*/
trait TransactionSpec extends StObject {
  
  /**
    Set [annotations](https://codemirror.net/6/docs/ref/#state.Annotation) for this transaction.
    */
  var annotations: js.UndefOr[Annotation[Any] | js.Array[Annotation[Any]]] = js.undefined
  
  /**
    The changes to the document made by this transaction.
    */
  var changes: js.UndefOr[ChangeSpec] = js.undefined
  
  /**
    Attach [state effects](https://codemirror.net/6/docs/ref/#state.StateEffect) to this transaction.
    Again, when they contain positions and this same spec makes
    changes, those positions should refer to positions in the
    updated document.
    */
  var effects: js.UndefOr[StateEffect[Any] | js.Array[StateEffect[Any]]] = js.undefined
  
  /**
    By default, transactions can be modified by [change
    filters](https://codemirror.net/6/docs/ref/#state.EditorState^changeFilter) and [transaction
    filters](https://codemirror.net/6/docs/ref/#state.EditorState^transactionFilter). You can set this
    to `false` to disable that. This can be necessary for
    transactions that, for example, include annotations that must be
    kept consistent with their changes.
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  
  /**
    When set to `true`, the transaction is marked as needing to
    scroll the current selection into view.
    */
  var scrollIntoView: js.UndefOr[Boolean] = js.undefined
  
  /**
    When set, this transaction explicitly updates the selection.
    Offsets in this selection should refer to the document as it is
    _after_ the transaction.
    */
  var selection: js.UndefOr[EditorSelection | Anchor] = js.undefined
  
  /**
    Normally, when multiple specs are combined (for example by
    [`EditorState.update`](https://codemirror.net/6/docs/ref/#state.EditorState.update)), the
    positions in `changes` are taken to refer to the document
    positions in the initial document. When a spec has `sequental`
    set to true, its positions will be taken to refer to the
    document created by the specs before it instead.
    */
  var sequential: js.UndefOr[Boolean] = js.undefined
  
  /**
    Shorthand for `annotations:` [`Transaction.userEvent`](https://codemirror.net/6/docs/ref/#state.Transaction^userEvent)`.of(...)`.
    */
  var userEvent: js.UndefOr[String] = js.undefined
}
object TransactionSpec {
  
  inline def apply(): TransactionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionSpec] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: Annotation[Any] | js.Array[Annotation[Any]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Annotation[Any]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setChanges(value: ChangeSpec): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: Any*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setEffects(value: StateEffect[Any] | js.Array[StateEffect[Any]]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: StateEffect[Any]*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setScrollIntoView(value: Boolean): Self = StObject.set(x, "scrollIntoView", value.asInstanceOf[js.Any])
    
    inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    inline def setSelection(value: EditorSelection | Anchor): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSequential(value: Boolean): Self = StObject.set(x, "sequential", value.asInstanceOf[js.Any])
    
    inline def setSequentialUndefined: Self = StObject.set(x, "sequential", js.undefined)
    
    inline def setUserEvent(value: String): Self = StObject.set(x, "userEvent", value.asInstanceOf[js.Any])
    
    inline def setUserEventUndefined: Self = StObject.set(x, "userEvent", js.undefined)
  }
}
