package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExportDefaultDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExportDefaultDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExportDefaultDeclaration, TState]] = js.undefined
}
object `91` {
  
  inline def apply[TState](): `91`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`91`[TState]]
  }
  
  extension [Self <: `91`[?], TState](x: Self & `91`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExportDefaultDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExportDefaultDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
