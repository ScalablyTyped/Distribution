package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.OptionalMemberExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[OptionalMemberExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[OptionalMemberExpression, TState]] = js.undefined
}
object `30` {
  
  inline def apply[TState](): `30`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`30`[TState]]
  }
  
  extension [Self <: `30`[?], TState](x: Self & `30`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[OptionalMemberExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OptionalMemberExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
