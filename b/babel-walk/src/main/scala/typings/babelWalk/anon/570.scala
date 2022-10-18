package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassBody
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `570`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassBody, TState]] = js.undefined
}
object `570` {
  
  inline def apply[TState](): `570`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`570`[TState]]
  }
  
  extension [Self <: `570`[?], TState](x: Self & `570`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
