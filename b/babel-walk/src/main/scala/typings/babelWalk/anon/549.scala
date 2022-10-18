package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXClosingFragment
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `549`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXClosingFragment, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXClosingFragment, TState]] = js.undefined
}
object `549` {
  
  inline def apply[TState](): `549`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`549`[TState]]
  }
  
  extension [Self <: `549`[?], TState](x: Self & `549`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXClosingFragment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXClosingFragment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
