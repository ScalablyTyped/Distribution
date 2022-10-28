package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.VoidTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `420`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VoidTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[VoidTypeAnnotation, TState]] = js.undefined
}
object `420` {
  
  inline def apply[TState](): `420`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`420`[TState]]
  }
  
  extension [Self <: `420`[?], TState](x: Self & `420`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VoidTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VoidTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
