package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeAlias
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
}
object `214` {
  
  inline def apply[TState](): `214`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`214`[TState]]
  }
  
  extension [Self <: `214`[?], TState](x: Self & `214`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeAlias], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeAlias], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
