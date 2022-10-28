package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanLiteralTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `509`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
}
object `509` {
  
  inline def apply[TState](): `509`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`509`[TState]]
  }
  
  extension [Self <: `509`[?], TState](x: Self & `509`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
