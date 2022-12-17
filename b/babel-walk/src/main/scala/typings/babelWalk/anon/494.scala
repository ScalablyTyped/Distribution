package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ForOfStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `494`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ForOfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ForOfStatement, TState]] = js.undefined
}
object `494` {
  
  inline def apply[TState](): `494`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`494`[TState]]
  }
  
  extension [Self <: `494`[?], TState](x: Self & `494`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForOfStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForOfStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
