package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `524`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForStatement, TState]] = js.undefined
}
object `524` {
  
  inline def apply[TState](): `524`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`524`[TState]]
  }
  
  extension [Self <: `524`[?], TState](x: Self & `524`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
