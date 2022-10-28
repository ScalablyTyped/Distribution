package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBooleanBody
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `458`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBooleanBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBooleanBody, TState]] = js.undefined
}
object `458` {
  
  inline def apply[TState](): `458`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`458`[TState]]
  }
  
  extension [Self <: `458`[?], TState](x: Self & `458`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumBooleanBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumBooleanBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
