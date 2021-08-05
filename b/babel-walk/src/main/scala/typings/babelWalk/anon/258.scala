package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSParenthesizedType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSParenthesizedType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSParenthesizedType, TState]] = js.undefined
}
object `258` {
  
  inline def apply[TState](): `258`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`258`[TState]]
  }
  
  extension [Self <: `258`[?], TState](x: Self & `258`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSParenthesizedType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSParenthesizedType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
