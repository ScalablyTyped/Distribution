package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ReturnStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `303`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ReturnStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ReturnStatement, TState]] = js.undefined
}
object `303` {
  
  inline def apply[TState](): `303`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`303`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `303`[?], TState] (val x: Self & `303`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ReturnStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ReturnStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
