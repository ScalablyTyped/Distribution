package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.SwitchCase
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `360`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SwitchCase, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[SwitchCase, TState]] = js.undefined
}
object `360` {
  
  inline def apply[TState](): `360`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`360`[TState]]
  }
  
  extension [Self <: `360`[?], TState](x: Self & `360`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[SwitchCase], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SwitchCase], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
