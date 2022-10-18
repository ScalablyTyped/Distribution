package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeInternalSlot
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `571`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeInternalSlot, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeInternalSlot, TState]] = js.undefined
}
object `571` {
  
  inline def apply[TState](): `571`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`571`[TState]]
  }
  
  extension [Self <: `571`[?], TState](x: Self & `571`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeInternalSlot], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeInternalSlot], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
