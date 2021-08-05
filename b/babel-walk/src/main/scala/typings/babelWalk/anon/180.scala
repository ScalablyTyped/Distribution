package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareExportDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareExportDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareExportDeclaration, TState]] = js.undefined
}
object `180` {
  
  inline def apply[TState](): `180`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`180`[TState]]
  }
  
  extension [Self <: `180`[?], TState](x: Self & `180`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareExportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareExportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
