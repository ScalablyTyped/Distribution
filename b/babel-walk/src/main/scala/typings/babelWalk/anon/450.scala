package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.StringLiteral
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `450`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
}
object `450` {
  
  inline def apply[TState](): `450`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`450`[TState]]
  }
  
  extension [Self <: `450`[?], TState](x: Self & `450`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
