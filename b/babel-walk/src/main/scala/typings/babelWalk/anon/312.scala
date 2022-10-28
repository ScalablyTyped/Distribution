package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TupleTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `312`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TupleTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TupleTypeAnnotation, TState]] = js.undefined
}
object `312` {
  
  inline def apply[TState](): `312`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`312`[TState]]
  }
  
  extension [Self <: `312`[?], TState](x: Self & `312`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TupleTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TupleTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
