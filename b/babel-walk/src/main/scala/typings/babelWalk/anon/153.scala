package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.StringLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
}
object `153` {
  
  inline def apply[TState](): `153`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`153`[TState]]
  }
  
  extension [Self <: `153`[?], TState](x: Self & `153`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
