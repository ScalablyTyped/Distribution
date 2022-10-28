package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.NumberLiteralTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `485`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[NumberLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[NumberLiteralTypeAnnotation, TState]] = js.undefined
}
object `485` {
  
  inline def apply[TState](): `485`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`485`[TState]]
  }
  
  extension [Self <: `485`[?], TState](x: Self & `485`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[NumberLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[NumberLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
