package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ModuleSpecifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ModuleSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ModuleSpecifier, TState]] = js.undefined
}
object `163` {
  
  inline def apply[TState](): `163`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`163`[TState]]
  }
  
  extension [Self <: `163`[?], TState](x: Self & `163`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ModuleSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ModuleSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
