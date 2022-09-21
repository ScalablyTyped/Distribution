package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectPattern
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `265`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectPattern, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectPattern, TState]] = js.undefined
}
object `265` {
  
  inline def apply[TState](): `265`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`265`[TState]]
  }
  
  extension [Self <: `265`[?], TState](x: Self & `265`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectPattern], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectPattern], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
