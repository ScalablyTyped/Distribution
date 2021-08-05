package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSConditionalType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSConditionalType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSConditionalType, TState]] = js.undefined
}
object `18` {
  
  inline def apply[TState](): `18`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[TState]]
  }
  
  extension [Self <: `18`[?], TState](x: Self & `18`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSConditionalType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSConditionalType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
