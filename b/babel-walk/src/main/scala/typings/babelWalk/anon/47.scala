package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Accessor
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Accessor, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Accessor, TState]] = js.undefined
}
object `47` {
  
  inline def apply[TState](): `47`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`47`[TState]]
  }
  
  extension [Self <: `47`[?], TState](x: Self & `47`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Accessor], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Accessor], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
