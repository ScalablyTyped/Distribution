package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ThisExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `276`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ThisExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ThisExpression, TState]] = js.undefined
}
object `276` {
  
  inline def apply[TState](): `276`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`276`[TState]]
  }
  
  extension [Self <: `276`[?], TState](x: Self & `276`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ThisExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ThisExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
