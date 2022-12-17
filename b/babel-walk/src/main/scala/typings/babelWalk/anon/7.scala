package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSAsExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSAsExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSAsExpression, TState]] = js.undefined
}
object `7` {
  
  inline def apply[TState](): `7`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[TState]]
  }
  
  extension [Self <: `7`[?], TState](x: Self & `7`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSAsExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSAsExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
