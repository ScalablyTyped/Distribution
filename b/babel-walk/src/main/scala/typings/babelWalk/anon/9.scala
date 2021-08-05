package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSAnyKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSAnyKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSAnyKeyword, TState]] = js.undefined
}
object `9` {
  
  inline def apply[TState](): `9`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`[TState]]
  }
  
  extension [Self <: `9`[?], TState](x: Self & `9`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSAnyKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSAnyKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
