package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSConstructorType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSConstructorType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSConstructorType, TState]] = js.undefined
}
object `254` {
  
  inline def apply[TState](): `254`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`254`[TState]]
  }
  
  extension [Self <: `254`[?], TState](x: Self & `254`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSConstructorType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSConstructorType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
