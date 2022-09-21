package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareExportAllDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareExportAllDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareExportAllDeclaration, TState]] = js.undefined
}
object `125` {
  
  inline def apply[TState](): `125`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`125`[TState]]
  }
  
  extension [Self <: `125`[?], TState](x: Self & `125`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareExportAllDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareExportAllDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
