package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSThisType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `249`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSThisType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSThisType, TState]] = js.undefined
}
object `249` {
  
  inline def apply[TState](): `249`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`249`[TState]]
  }
  
  extension [Self <: `249`[?], TState](x: Self & `249`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSThisType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSThisType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
