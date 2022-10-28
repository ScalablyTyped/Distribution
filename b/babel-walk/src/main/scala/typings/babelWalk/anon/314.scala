package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeParameterDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `314`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeParameterDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeParameterDeclaration, TState]] = js.undefined
}
object `314` {
  
  inline def apply[TState](): `314`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`314`[TState]]
  }
  
  extension [Self <: `314`[?], TState](x: Self & `314`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
