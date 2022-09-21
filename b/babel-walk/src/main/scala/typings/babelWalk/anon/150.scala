package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.VariableDeclarator
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VariableDeclarator, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[VariableDeclarator, TState]] = js.undefined
}
object `150` {
  
  inline def apply[TState](): `150`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`150`[TState]]
  }
  
  extension [Self <: `150`[?], TState](x: Self & `150`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VariableDeclarator], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VariableDeclarator], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
