package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExistsTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExistsTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExistsTypeAnnotation, TState]] = js.undefined
}
object `134` {
  
  inline def apply[TState](): `134`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`134`[TState]]
  }
  
  extension [Self <: `134`[?], TState](x: Self & `134`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExistsTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExistsTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
