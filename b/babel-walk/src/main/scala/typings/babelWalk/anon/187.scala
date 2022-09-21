package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareExportDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareExportDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareExportDeclaration, TState]] = js.undefined
}
object `187` {
  
  inline def apply[TState](): `187`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`187`[TState]]
  }
  
  extension [Self <: `187`[?], TState](x: Self & `187`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareExportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareExportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
