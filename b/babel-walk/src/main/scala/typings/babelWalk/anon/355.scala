package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ThisTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `355`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ThisTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ThisTypeAnnotation, TState]] = js.undefined
}
object `355` {
  
  inline def apply[TState](): `355`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`355`[TState]]
  }
  
  extension [Self <: `355`[?], TState](x: Self & `355`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ThisTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ThisTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
