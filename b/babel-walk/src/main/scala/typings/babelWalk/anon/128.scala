package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSPropertySignature
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSPropertySignature, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSPropertySignature, TState]] = js.undefined
}
object `128` {
  
  inline def apply[TState](): `128`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`128`[TState]]
  }
  
  extension [Self <: `128`[?], TState](x: Self & `128`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSPropertySignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSPropertySignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
