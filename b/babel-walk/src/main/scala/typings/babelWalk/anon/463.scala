package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.V8IntrinsicIdentifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `463`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.undefined
}
object `463` {
  
  inline def apply[TState](): `463`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`463`[TState]]
  }
  
  extension [Self <: `463`[?], TState](x: Self & `463`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
