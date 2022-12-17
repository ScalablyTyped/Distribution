package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumSymbolBody
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `237`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumSymbolBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumSymbolBody, TState]] = js.undefined
}
object `237` {
  
  inline def apply[TState](): `237`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`237`[TState]]
  }
  
  extension [Self <: `237`[?], TState](x: Self & `237`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumSymbolBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumSymbolBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
