package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.GenericTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `290`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[GenericTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[GenericTypeAnnotation, TState]] = js.undefined
}
object `290` {
  
  inline def apply[TState](): `290`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`290`[TState]]
  }
  
  extension [Self <: `290`[?], TState](x: Self & `290`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[GenericTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[GenericTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
