package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.RecordExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[RecordExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[RecordExpression, TState]] = js.undefined
}
object `67` {
  
  inline def apply[TState](): `67`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`[TState]]
  }
  
  extension [Self <: `67`[?], TState](x: Self & `67`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[RecordExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[RecordExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
