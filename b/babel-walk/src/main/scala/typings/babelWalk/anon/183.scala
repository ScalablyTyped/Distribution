package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Declaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Declaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Declaration, TState]] = js.undefined
}
object `183` {
  
  inline def apply[TState](): `183`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`183`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `183`[?], TState] (val x: Self & `183`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[Declaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Declaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
