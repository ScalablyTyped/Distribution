package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.VariableDeclarator
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `449`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VariableDeclarator, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[VariableDeclarator, TState]] = js.undefined
}
object `449` {
  
  inline def apply[TState](): `449`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`449`[TState]]
  }
  
  extension [Self <: `449`[?], TState](x: Self & `449`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VariableDeclarator], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VariableDeclarator], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
