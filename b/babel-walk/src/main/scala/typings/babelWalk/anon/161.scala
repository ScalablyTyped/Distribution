package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.V8IntrinsicIdentifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.undefined
}
object `161` {
  
  inline def apply[TState](): `161`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`161`[TState]]
  }
  
  extension [Self <: `161`[?], TState](x: Self & `161`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
