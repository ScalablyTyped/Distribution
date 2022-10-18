package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportNamespaceSpecifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `538`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportNamespaceSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportNamespaceSpecifier, TState]] = js.undefined
}
object `538` {
  
  inline def apply[TState](): `538`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`538`[TState]]
  }
  
  extension [Self <: `538`[?], TState](x: Self & `538`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportNamespaceSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportNamespaceSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
