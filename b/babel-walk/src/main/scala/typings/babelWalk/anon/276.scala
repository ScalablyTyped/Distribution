package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeInternalSlot
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `276`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeInternalSlot, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeInternalSlot, TState]] = js.undefined
}
object `276` {
  
  inline def apply[TState](): `276`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`276`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `276`[?], TState] (val x: Self & `276`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeInternalSlot], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeInternalSlot], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
