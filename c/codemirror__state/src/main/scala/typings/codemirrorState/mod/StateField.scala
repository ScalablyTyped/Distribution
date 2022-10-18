package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Fields can store additional information in an editor state, and
keep it in sync with the rest of the state.
*/
@js.native
trait StateField[Value]
  extends StObject
     with _Slot[Value] {
  
  /* private */ var compareF: Any = js.native
  
  /* private */ var create: Any = js.native
  
  /* private */ var createF: Any = js.native
  
  /**
    State field instances can be used as
    [`Extension`](https://codemirror.net/6/docs/ref/#state.Extension) values to enable the field in a
    given state.
    */
  def `extension`: Extension = js.native
  
  /**
    Returns an extension that enables this field and overrides the
    way it is initialized. Can be useful when you need to provide a
    non-default starting value for the field.
    */
  def init(create: js.Function1[/* state */ EditorState, Value]): Extension = js.native
  
  /* private */ var updateF: Any = js.native
}
