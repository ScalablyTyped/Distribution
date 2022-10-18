package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Standardized
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `311`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Standardized, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Standardized, TState]] = js.undefined
}
object `311` {
  
  inline def apply[TState](): `311`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`311`[TState]]
  }
  
  extension [Self <: `311`[?], TState](x: Self & `311`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Standardized], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Standardized], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
