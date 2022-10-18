package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumDefaultedMember
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `525`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumDefaultedMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumDefaultedMember, TState]] = js.undefined
}
object `525` {
  
  inline def apply[TState](): `525`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`525`[TState]]
  }
  
  extension [Self <: `525`[?], TState](x: Self & `525`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumDefaultedMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumDefaultedMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
