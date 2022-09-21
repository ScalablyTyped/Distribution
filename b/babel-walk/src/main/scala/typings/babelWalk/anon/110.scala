package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.NullableTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[NullableTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[NullableTypeAnnotation, TState]] = js.undefined
}
object `110` {
  
  inline def apply[TState](): `110`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`110`[TState]]
  }
  
  extension [Self <: `110`[?], TState](x: Self & `110`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[NullableTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[NullableTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
