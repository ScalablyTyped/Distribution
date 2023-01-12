package typings.codemirrorView.mod

import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.EditorStateConfig
import typings.codemirrorState.mod.Transaction
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
The type of object given to the [`EditorView`](https://codemirror.net/6/docs/ref/#view.EditorView)
constructor.
*/
trait EditorViewConfig
  extends StObject
     with EditorStateConfig {
  
  /**
    Override the transaction [dispatch
    function](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch) for this editor view, which
    is the way updates get routed to the view. Your implementation,
    if provided, should probably call the view's [`update`
    method](https://codemirror.net/6/docs/ref/#view.EditorView.update).
    */
  var dispatch: js.UndefOr[js.Function1[/* tr */ Transaction, Unit]] = js.undefined
  
  /**
    When given, the editor is immediately appended to the given
    element on creation. (Otherwise, you'll have to place the view's
    [`dom`](https://codemirror.net/6/docs/ref/#view.EditorView.dom) element in the document yourself.)
    */
  var parent: js.UndefOr[Element | DocumentFragment] = js.undefined
  
  /**
    If the view is going to be mounted in a shadow root or document
    other than the one held by the global variable `document` (the
    default), you should pass it here. If you provide `parent`, but
    not this option, the editor will automatically look up a root
    from the parent.
    */
  var root: js.UndefOr[Document | ShadowRoot] = js.undefined
  
  /**
    The view's initial state. If not given, a new state is created
    by passing this configuration object to
    [`EditorState.create`](https://codemirror.net/6/docs/ref/#state.EditorState^create), using its
    `doc`, `selection`, and `extensions` field (if provided).
    */
  var state: js.UndefOr[EditorState] = js.undefined
}
object EditorViewConfig {
  
  inline def apply(): EditorViewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorViewConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorViewConfig] (val x: Self) extends AnyVal {
    
    inline def setDispatch(value: /* tr */ Transaction => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
    
    inline def setParent(value: Element | DocumentFragment): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRoot(value: Document | ShadowRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
