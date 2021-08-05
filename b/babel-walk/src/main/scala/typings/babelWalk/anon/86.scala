package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSType, TState]] = js.undefined
}
object `86` {
  
  inline def apply[TState](): `86`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`86`[TState]]
  }
  
  extension [Self <: `86`[?], TState](x: Self & `86`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
