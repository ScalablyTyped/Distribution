package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXText
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
}
object `225` {
  
  inline def apply[TState](): `225`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`225`[TState]]
  }
  
  extension [Self <: `225`[?], TState](x: Self & `225`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXText], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXText], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
