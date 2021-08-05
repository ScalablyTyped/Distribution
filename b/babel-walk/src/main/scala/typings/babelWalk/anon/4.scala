package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ReturnStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ReturnStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ReturnStatement, TState]] = js.undefined
}
object `4` {
  
  inline def apply[TState](): `4`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[TState]]
  }
  
  extension [Self <: `4`[?], TState](x: Self & `4`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ReturnStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ReturnStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
