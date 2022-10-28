package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.WithStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `407`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[WithStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[WithStatement, TState]] = js.undefined
}
object `407` {
  
  inline def apply[TState](): `407`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`407`[TState]]
  }
  
  extension [Self <: `407`[?], TState](x: Self & `407`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[WithStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[WithStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
