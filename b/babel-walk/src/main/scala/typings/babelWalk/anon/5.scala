package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSInterfaceBody
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInterfaceBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInterfaceBody, TState]] = js.undefined
}
object `5` {
  
  inline def apply[TState](): `5`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[TState]]
  }
  
  extension [Self <: `5`[?], TState](x: Self & `5`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInterfaceBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInterfaceBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
