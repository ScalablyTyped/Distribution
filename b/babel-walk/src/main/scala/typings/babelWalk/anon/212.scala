package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanLiteralTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BooleanLiteralTypeAnnotation, TState]] = js.undefined
}
object `212` {
  
  inline def apply[TState](): `212`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`212`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `212`[?], TState] (val x: Self & `212`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
