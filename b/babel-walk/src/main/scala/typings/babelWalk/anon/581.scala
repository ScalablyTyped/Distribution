package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowDeclaration, TState]] = js.undefined
}
object `581` {
  
  inline def apply[TState](): `581`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`581`[TState]]
  }
  
  extension [Self <: `581`[?], TState](x: Self & `581`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
