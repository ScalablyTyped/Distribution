package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.IfStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `395`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.undefined
}
object `395` {
  
  inline def apply[TState](): `395`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`395`[TState]]
  }
  
  extension [Self <: `395`[?], TState](x: Self & `395`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[IfStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[IfStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
