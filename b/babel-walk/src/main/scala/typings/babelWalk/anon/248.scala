package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Block, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Block, TState]] = js.undefined
}
object `248` {
  
  inline def apply[TState](): `248`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`248`[TState]]
  }
  
  extension [Self <: `248`[?], TState](x: Self & `248`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
