package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.IntersectionTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[IntersectionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[IntersectionTypeAnnotation, TState]] = js.undefined
}
object `256` {
  
  inline def apply[TState](): `256`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`256`[TState]]
  }
  
  extension [Self <: `256`[?], TState](x: Self & `256`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[IntersectionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[IntersectionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
