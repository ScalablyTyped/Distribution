package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeParameterInstantiation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `282`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeParameterInstantiation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeParameterInstantiation, TState]] = js.undefined
}
object `282` {
  
  inline def apply[TState](): `282`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`282`[TState]]
  }
  
  extension [Self <: `282`[?], TState](x: Self & `282`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeParameterInstantiation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeParameterInstantiation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
