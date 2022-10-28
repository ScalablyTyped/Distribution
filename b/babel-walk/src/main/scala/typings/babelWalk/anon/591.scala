package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeParameterInstantiation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `591`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeParameterInstantiation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeParameterInstantiation, TState]] = js.undefined
}
object `591` {
  
  inline def apply[TState](): `591`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`591`[TState]]
  }
  
  extension [Self <: `591`[?], TState](x: Self & `591`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeParameterInstantiation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeParameterInstantiation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
