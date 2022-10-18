package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExportDefaultSpecifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `299`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExportDefaultSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExportDefaultSpecifier, TState]] = js.undefined
}
object `299` {
  
  inline def apply[TState](): `299`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`299`[TState]]
  }
  
  extension [Self <: `299`[?], TState](x: Self & `299`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
