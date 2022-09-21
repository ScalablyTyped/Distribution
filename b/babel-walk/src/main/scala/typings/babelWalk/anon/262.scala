package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UnionTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UnionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UnionTypeAnnotation, TState]] = js.undefined
}
object `262` {
  
  inline def apply[TState](): `262`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`262`[TState]]
  }
  
  extension [Self <: `262`[?], TState](x: Self & `262`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UnionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UnionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
