package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXIdentifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXIdentifier, TState]] = js.undefined
}
object `98` {
  
  inline def apply[TState](): `98`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`98`[TState]]
  }
  
  extension [Self <: `98`[?], TState](x: Self & `98`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
