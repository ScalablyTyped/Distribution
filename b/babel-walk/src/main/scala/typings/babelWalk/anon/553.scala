package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSConstructorType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `553`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSConstructorType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSConstructorType, TState]] = js.undefined
}
object `553` {
  
  inline def apply[TState](): `553`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`553`[TState]]
  }
  
  extension [Self <: `553`[?], TState](x: Self & `553`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSConstructorType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSConstructorType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
