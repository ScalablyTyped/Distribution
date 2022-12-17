package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExportDefaultDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExportDefaultDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExportDefaultDeclaration, TState]] = js.undefined
}
object `92` {
  
  inline def apply[TState](): `92`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`92`[TState]]
  }
  
  extension [Self <: `92`[?], TState](x: Self & `92`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExportDefaultDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExportDefaultDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
