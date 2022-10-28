package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.MemberExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `367`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[MemberExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[MemberExpression, TState]] = js.undefined
}
object `367` {
  
  inline def apply[TState](): `367`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`367`[TState]]
  }
  
  extension [Self <: `367`[?], TState](x: Self & `367`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[MemberExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[MemberExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
