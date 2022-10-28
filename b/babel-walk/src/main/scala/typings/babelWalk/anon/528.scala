package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassProperty
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `528`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassProperty, TState]] = js.undefined
}
object `528` {
  
  inline def apply[TState](): `528`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`528`[TState]]
  }
  
  extension [Self <: `528`[?], TState](x: Self & `528`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
