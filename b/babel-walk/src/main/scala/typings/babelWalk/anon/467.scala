package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectProperty
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `467`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectProperty, TState]] = js.undefined
}
object `467` {
  
  inline def apply[TState](): `467`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`467`[TState]]
  }
  
  extension [Self <: `467`[?], TState](x: Self & `467`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
