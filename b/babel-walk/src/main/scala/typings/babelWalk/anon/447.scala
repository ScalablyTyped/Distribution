package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSMappedType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `447`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSMappedType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSMappedType, TState]] = js.undefined
}
object `447` {
  
  inline def apply[TState](): `447`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`447`[TState]]
  }
  
  extension [Self <: `447`[?], TState](x: Self & `447`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSMappedType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSMappedType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
