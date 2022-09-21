package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Literal
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Literal, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Literal, TState]] = js.undefined
}
object `179` {
  
  inline def apply[TState](): `179`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`179`[TState]]
  }
  
  extension [Self <: `179`[?], TState](x: Self & `179`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Literal], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Literal], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
