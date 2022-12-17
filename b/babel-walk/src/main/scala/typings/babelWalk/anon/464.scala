package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ThrowStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `464`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ThrowStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ThrowStatement, TState]] = js.undefined
}
object `464` {
  
  inline def apply[TState](): `464`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`464`[TState]]
  }
  
  extension [Self <: `464`[?], TState](x: Self & `464`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ThrowStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ThrowStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
