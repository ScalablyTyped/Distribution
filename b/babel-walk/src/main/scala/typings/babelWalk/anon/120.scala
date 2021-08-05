package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareExportAllDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareExportAllDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareExportAllDeclaration, TState]] = js.undefined
}
object `120` {
  
  inline def apply[TState](): `120`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`120`[TState]]
  }
  
  extension [Self <: `120`[?], TState](x: Self & `120`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareExportAllDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareExportAllDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
