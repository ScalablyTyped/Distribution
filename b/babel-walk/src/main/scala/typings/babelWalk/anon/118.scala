package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareFunction
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareFunction, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareFunction, TState]] = js.undefined
}
object `118` {
  
  inline def apply[TState](): `118`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`118`[TState]]
  }
  
  extension [Self <: `118`[?], TState](x: Self & `118`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareFunction], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareFunction], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
