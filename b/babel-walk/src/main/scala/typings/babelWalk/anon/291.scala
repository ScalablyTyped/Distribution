package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBody
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `291`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
}
object `291` {
  
  inline def apply[TState](): `291`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`291`[TState]]
  }
  
  extension [Self <: `291`[?], TState](x: Self & `291`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
