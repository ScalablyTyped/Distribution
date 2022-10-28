package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNamedTupleMember
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `562`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNamedTupleMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNamedTupleMember, TState]] = js.undefined
}
object `562` {
  
  inline def apply[TState](): `562`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`562`[TState]]
  }
  
  extension [Self <: `562`[?], TState](x: Self & `562`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSNamedTupleMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNamedTupleMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
