package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.OpaqueType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[OpaqueType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[OpaqueType, TState]] = js.undefined
}
object `81` {
  
  inline def apply[TState](): `81`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`81`[TState]]
  }
  
  extension [Self <: `81`[?], TState](x: Self & `81`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[OpaqueType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OpaqueType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
