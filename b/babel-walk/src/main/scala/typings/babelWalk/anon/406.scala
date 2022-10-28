package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PrivateName
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `406`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PrivateName, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PrivateName, TState]] = js.undefined
}
object `406` {
  
  inline def apply[TState](): `406`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`406`[TState]]
  }
  
  extension [Self <: `406`[?], TState](x: Self & `406`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[PrivateName], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[PrivateName], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
