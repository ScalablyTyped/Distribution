package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Pureish
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `444`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Pureish, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Pureish, TState]] = js.undefined
}
object `444` {
  
  inline def apply[TState](): `444`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`444`[TState]]
  }
  
  extension [Self <: `444`[?], TState](x: Self & `444`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Pureish], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Pureish], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
