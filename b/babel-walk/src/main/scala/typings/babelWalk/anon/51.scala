package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.SwitchStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SwitchStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[SwitchStatement, TState]] = js.undefined
}
object `51` {
  
  inline def apply[TState](): `51`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`[TState]]
  }
  
  extension [Self <: `51`[?], TState](x: Self & `51`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[SwitchStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SwitchStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
