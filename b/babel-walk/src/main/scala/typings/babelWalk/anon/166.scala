package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterfaceExtends
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterfaceExtends, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InterfaceExtends, TState]] = js.undefined
}
object `166` {
  
  inline def apply[TState](): `166`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`166`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`[?], TState] (val x: Self & `166`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[InterfaceExtends], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InterfaceExtends], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
