package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `320`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeAnnotation, TState]] = js.undefined
}
object `320` {
  
  inline def apply[TState](): `320`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`320`[TState]]
  }
  
  extension [Self <: `320`[?], TState](x: Self & `320`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
