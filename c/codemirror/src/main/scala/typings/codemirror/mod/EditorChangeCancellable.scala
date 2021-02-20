package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorChangeCancellable extends EditorChange {
  
  def cancel(): Unit = js.native
  
  /** may be used to modify the change. All three arguments to update are optional, and can be left off to leave the existing value for that field intact.
    If the change came from undo/redo, `update` is undefined and the change cannot be modified. */
  var update: js.UndefOr[
    js.Function3[
      /* from */ js.UndefOr[Position], 
      /* to */ js.UndefOr[Position], 
      /* text */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
}
object EditorChangeCancellable {
  
  @scala.inline
  def apply(cancel: () => Unit, from: Position, text: js.Array[String], to: Position): EditorChangeCancellable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeCancellable]
  }
  
  @scala.inline
  implicit class EditorChangeCancellableMutableBuilder[Self <: EditorChangeCancellable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(
      value: (/* from */ js.UndefOr[Position], /* to */ js.UndefOr[Position], /* text */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
