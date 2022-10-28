package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `295`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
}
object `295` {
  
  inline def apply[TState](): `295`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`295`[TState]]
  }
  
  extension [Self <: `295`[?], TState](x: Self & `295`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
