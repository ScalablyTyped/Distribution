package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSParenthesizedType
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `567`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSParenthesizedType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSParenthesizedType, TState]] = js.undefined
}
object `567` {
  
  inline def apply[TState](): `567`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`567`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `567`[?], TState] (val x: Self & `567`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSParenthesizedType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSParenthesizedType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
