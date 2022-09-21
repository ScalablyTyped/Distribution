package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSEntityName
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSEntityName, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSEntityName, TState]] = js.undefined
}
object `151` {
  
  inline def apply[TState](): `151`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`151`[TState]]
  }
  
  extension [Self <: `151`[?], TState](x: Self & `151`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSEntityName], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSEntityName], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
