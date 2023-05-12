package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNamespaceExportDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNamespaceExportDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNamespaceExportDeclaration, TState]] = js.undefined
}
object `104` {
  
  inline def apply[TState](): `104`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`104`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `104`[?], TState] (val x: Self & `104`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
