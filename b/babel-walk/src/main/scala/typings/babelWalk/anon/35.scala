package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UserWhitespacable
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UserWhitespacable, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UserWhitespacable, TState]] = js.undefined
}
object `35` {
  
  inline def apply[TState](): `35`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`35`[TState]]
  }
  
  extension [Self <: `35`[?], TState](x: Self & `35`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UserWhitespacable], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UserWhitespacable], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
