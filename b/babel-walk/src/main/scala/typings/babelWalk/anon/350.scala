package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.SwitchStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `350`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[SwitchStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[SwitchStatement, TState]] = js.undefined
}
object `350` {
  
  inline def apply[TState](): `350`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`350`[TState]]
  }
  
  extension [Self <: `350`[?], TState](x: Self & `350`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[SwitchStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SwitchStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
