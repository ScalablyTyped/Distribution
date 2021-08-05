package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanLiteralTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
}
object `203` {
  
  inline def apply[TState](): `203`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`203`[TState]]
  }
  
  extension [Self <: `203`[?], TState](x: Self & `203`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
