package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeParameterDeclaration
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeParameterDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeParameterDeclaration, TState]] = js.undefined
}
object `16` {
  
  inline def apply[TState](): `16`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[TState]]
  }
  
  extension [Self <: `16`[?], TState](x: Self & `16`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
