package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TryStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `324`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TryStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TryStatement, TState]] = js.undefined
}
object `324` {
  
  inline def apply[TState](): `324`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`324`[TState]]
  }
  
  extension [Self <: `324`[?], TState](x: Self & `324`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TryStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TryStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
