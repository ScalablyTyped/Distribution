package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.VariableDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VariableDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[VariableDeclaration, TState]] = js.undefined
}
object `77` {
  
  inline def apply[TState](): `77`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`77`[TState]]
  }
  
  extension [Self <: `77`[?], TState](x: Self & `77`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VariableDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VariableDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
