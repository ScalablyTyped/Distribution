package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXText
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `530`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
}
object `530` {
  
  inline def apply[TState](): `530`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`530`[TState]]
  }
  
  extension [Self <: `530`[?], TState](x: Self & `530`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXText], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXText], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
