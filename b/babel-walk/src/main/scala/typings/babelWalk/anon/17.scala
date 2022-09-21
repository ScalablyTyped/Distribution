package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForInStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForInStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForInStatement, TState]] = js.undefined
}
object `17` {
  
  inline def apply[TState](): `17`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[TState]]
  }
  
  extension [Self <: `17`[?], TState](x: Self & `17`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForInStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForInStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
