package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UnionTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `559`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UnionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UnionTypeAnnotation, TState]] = js.undefined
}
object `559` {
  
  inline def apply[TState](): `559`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`559`[TState]]
  }
  
  extension [Self <: `559`[?], TState](x: Self & `559`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UnionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UnionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
