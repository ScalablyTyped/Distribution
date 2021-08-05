package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeAlias
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
}
object `205` {
  
  inline def apply[TState](): `205`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`205`[TState]]
  }
  
  extension [Self <: `205`[?], TState](x: Self & `205`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeAlias], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeAlias], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
