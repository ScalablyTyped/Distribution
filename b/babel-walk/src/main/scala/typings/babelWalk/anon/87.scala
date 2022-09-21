package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeScript
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeScript, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeScript, TState]] = js.undefined
}
object `87` {
  
  inline def apply[TState](): `87`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`87`[TState]]
  }
  
  extension [Self <: `87`[?], TState](x: Self & `87`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeScript], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeScript], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
