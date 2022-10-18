package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `545`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Block, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Block, TState]] = js.undefined
}
object `545` {
  
  inline def apply[TState](): `545`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`545`[TState]]
  }
  
  extension [Self <: `545`[?], TState](x: Self & `545`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
