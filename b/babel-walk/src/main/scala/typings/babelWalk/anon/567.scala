package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareOpaqueType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `567`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareOpaqueType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareOpaqueType, TState]] = js.undefined
}
object `567` {
  
  inline def apply[TState](): `567`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`567`[TState]]
  }
  
  extension [Self <: `567`[?], TState](x: Self & `567`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareOpaqueType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareOpaqueType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
