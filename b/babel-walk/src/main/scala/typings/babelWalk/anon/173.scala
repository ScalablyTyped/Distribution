package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.OptionalIndexedAccessType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[OptionalIndexedAccessType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[OptionalIndexedAccessType, TState]] = js.undefined
}
object `173` {
  
  inline def apply[TState](): `173`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`173`[TState]]
  }
  
  extension [Self <: `173`[?], TState](x: Self & `173`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[OptionalIndexedAccessType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OptionalIndexedAccessType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
