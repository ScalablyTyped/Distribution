package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.SymbolTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SymbolTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[SymbolTypeAnnotation, TState]] = js.undefined
}
object `57` {
  
  inline def apply[TState](): `57`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`57`[TState]]
  }
  
  extension [Self <: `57`[?], TState](x: Self & `57`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[SymbolTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SymbolTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
