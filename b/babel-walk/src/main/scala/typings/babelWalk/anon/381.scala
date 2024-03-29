package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.OpaqueType
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `381`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[OpaqueType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[OpaqueType, TState]] = js.undefined
}
object `381` {
  
  inline def apply[TState](): `381`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`381`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `381`[?], TState] (val x: Self & `381`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[OpaqueType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OpaqueType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
