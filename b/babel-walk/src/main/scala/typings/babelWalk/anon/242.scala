package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSMethodSignature
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSMethodSignature, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSMethodSignature, TState]] = js.undefined
}
object `242` {
  
  inline def apply[TState](): `242`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`242`[TState]]
  }
  
  extension [Self <: `242`[?], TState](x: Self & `242`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSMethodSignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSMethodSignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
