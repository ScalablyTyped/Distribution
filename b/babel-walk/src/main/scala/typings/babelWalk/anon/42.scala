package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.LabeledStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[LabeledStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[LabeledStatement, TState]] = js.undefined
}
object `42` {
  
  inline def apply[TState](): `42`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`42`[TState]]
  }
  
  extension [Self <: `42`[?], TState](x: Self & `42`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[LabeledStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[LabeledStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
