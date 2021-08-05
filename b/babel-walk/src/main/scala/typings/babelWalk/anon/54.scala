package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXSpreadAttribute
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXSpreadAttribute, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXSpreadAttribute, TState]] = js.undefined
}
object `54` {
  
  inline def apply[TState](): `54`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`54`[TState]]
  }
  
  extension [Self <: `54`[?], TState](x: Self & `54`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXSpreadAttribute], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXSpreadAttribute], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
