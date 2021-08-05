package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBooleanBody
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBooleanBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBooleanBody, TState]] = js.undefined
}
object `154` {
  
  inline def apply[TState](): `154`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`154`[TState]]
  }
  
  extension [Self <: `154`[?], TState](x: Self & `154`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumBooleanBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumBooleanBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
