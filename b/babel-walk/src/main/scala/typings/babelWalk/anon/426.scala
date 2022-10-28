package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `426`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeAnnotation, TState]] = js.undefined
}
object `426` {
  
  inline def apply[TState](): `426`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`426`[TState]]
  }
  
  extension [Self <: `426`[?], TState](x: Self & `426`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
