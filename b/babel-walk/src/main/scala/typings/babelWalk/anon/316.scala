package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSConditionalType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `316`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSConditionalType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSConditionalType, TState]] = js.undefined
}
object `316` {
  
  inline def apply[TState](): `316`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`316`[TState]]
  }
  
  extension [Self <: `316`[?], TState](x: Self & `316`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSConditionalType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSConditionalType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
