package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeAnnotation, TState]] = js.undefined
}
object `129` {
  
  inline def apply[TState](): `129`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`129`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`[?], TState] (val x: Self & `129`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
