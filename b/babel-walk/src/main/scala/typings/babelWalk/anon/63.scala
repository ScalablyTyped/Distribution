package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExportDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExportDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExportDeclaration, TState]] = js.undefined
}
object `63` {
  
  inline def apply[TState](): `63`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`63`[TState]]
  }
  
  extension [Self <: `63`[?], TState](x: Self & `63`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
