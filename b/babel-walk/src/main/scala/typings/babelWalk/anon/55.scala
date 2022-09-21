package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterfaceDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterfaceDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InterfaceDeclaration, TState]] = js.undefined
}
object `55` {
  
  inline def apply[TState](): `55`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`55`[TState]]
  }
  
  extension [Self <: `55`[?], TState](x: Self & `55`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
