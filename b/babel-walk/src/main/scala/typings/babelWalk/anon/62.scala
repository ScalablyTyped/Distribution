package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.MixedTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[MixedTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[MixedTypeAnnotation, TState]] = js.undefined
}
object `62` {
  
  inline def apply[TState](): `62`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`62`[TState]]
  }
  
  extension [Self <: `62`[?], TState](x: Self & `62`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[MixedTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[MixedTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
