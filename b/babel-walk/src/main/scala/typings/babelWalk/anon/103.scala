package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNamespaceExportDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNamespaceExportDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNamespaceExportDeclaration, TState]] = js.undefined
}
object `103` {
  
  inline def apply[TState](): `103`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`103`[TState]]
  }
  
  extension [Self <: `103`[?], TState](x: Self & `103`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
