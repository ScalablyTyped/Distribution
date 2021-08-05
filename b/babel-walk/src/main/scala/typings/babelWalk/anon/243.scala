package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSRestType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSRestType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSRestType, TState]] = js.undefined
}
object `243` {
  
  inline def apply[TState](): `243`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`243`[TState]]
  }
  
  extension [Self <: `243`[?], TState](x: Self & `243`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSRestType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSRestType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
