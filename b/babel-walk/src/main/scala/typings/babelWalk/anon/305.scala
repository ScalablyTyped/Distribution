package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BlockParent
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BlockParent, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BlockParent, TState]] = js.undefined
}
object `305` {
  
  inline def apply[TState](): `305`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`305`[TState]]
  }
  
  extension [Self <: `305`[?], TState](x: Self & `305`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BlockParent], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BlockParent], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
