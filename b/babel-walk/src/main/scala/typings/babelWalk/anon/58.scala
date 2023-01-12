package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.SymbolTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SymbolTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[SymbolTypeAnnotation, TState]] = js.undefined
}
object `58` {
  
  inline def apply[TState](): `58`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`58`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `58`[?], TState] (val x: Self & `58`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[SymbolTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SymbolTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
