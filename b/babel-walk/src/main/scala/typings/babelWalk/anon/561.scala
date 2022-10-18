package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareModuleExports
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `561`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareModuleExports, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareModuleExports, TState]] = js.undefined
}
object `561` {
  
  inline def apply[TState](): `561`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`561`[TState]]
  }
  
  extension [Self <: `561`[?], TState](x: Self & `561`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareModuleExports], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareModuleExports], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
