package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Block, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Block, TState]] = js.undefined
}
object `547` {
  
  inline def apply[TState](): `547`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`547`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `547`[?], TState] (val x: Self & `547`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
