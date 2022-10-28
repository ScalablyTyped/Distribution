package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.IfStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[IfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[IfStatement, TState]] = js.undefined
}
object `97` {
  
  inline def apply[TState](): `97`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`[TState]]
  }
  
  extension [Self <: `97`[?], TState](x: Self & `97`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[IfStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[IfStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
