package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeAssertion
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `267`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeAssertion, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeAssertion, TState]] = js.undefined
}
object `267` {
  
  inline def apply[TState](): `267`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`267`[TState]]
  }
  
  extension [Self <: `267`[?], TState](x: Self & `267`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeAssertion], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeAssertion], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
