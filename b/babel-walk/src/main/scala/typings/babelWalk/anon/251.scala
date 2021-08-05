package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXOpeningFragment
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `251`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXOpeningFragment, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXOpeningFragment, TState]] = js.undefined
}
object `251` {
  
  inline def apply[TState](): `251`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`251`[TState]]
  }
  
  extension [Self <: `251`[?], TState](x: Self & `251`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXOpeningFragment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXOpeningFragment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
