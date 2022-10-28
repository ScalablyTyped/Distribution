package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSOptionalType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `519`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
}
object `519` {
  
  inline def apply[TState](): `519`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`519`[TState]]
  }
  
  extension [Self <: `519`[?], TState](x: Self & `519`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSOptionalType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSOptionalType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
