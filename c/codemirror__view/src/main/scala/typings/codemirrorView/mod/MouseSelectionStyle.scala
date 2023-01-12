package typings.codemirrorView.mod

import typings.codemirrorState.mod.EditorSelection
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Interface that objects registered with
[`EditorView.mouseSelectionStyle`](https://codemirror.net/6/docs/ref/#view.EditorView^mouseSelectionStyle)
must conform to.
*/
trait MouseSelectionStyle extends StObject {
  
  /**
    Return a new selection for the mouse gesture that starts with
    the event that was originally given to the constructor, and ends
    with the event passed here. In case of a plain click, those may
    both be the `mousedown` event, in case of a drag gesture, the
    latest `mousemove` event will be passed.
    
    When `extend` is true, that means the new selection should, if
    possible, extend the start selection. If `multiple` is true, the
    new selection should be added to the original selection.
    */
  def get(curEvent: MouseEvent, extend: Boolean, multiple: Boolean): EditorSelection
  
  /**
    Called when the view is updated while the gesture is in
    progress. When the document changes, it may be necessary to map
    some data (like the original selection or start position)
    through the changes.
    
    This may return `true` to indicate that the `get` method should
    get queried again after the update, because something in the
    update could change its result. Be wary of infinite loops when
    using this (where `get` returns a new selection, which will
    trigger `update`, which schedules another `get` in response).
    */
  def update(update: ViewUpdate): Boolean | Unit
}
object MouseSelectionStyle {
  
  inline def apply(get: (MouseEvent, Boolean, Boolean) => EditorSelection, update: ViewUpdate => Boolean | Unit): MouseSelectionStyle = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MouseSelectionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseSelectionStyle] (val x: Self) extends AnyVal {
    
    inline def setGet(value: (MouseEvent, Boolean, Boolean) => EditorSelection): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: ViewUpdate => Boolean | Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
