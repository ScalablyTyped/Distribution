package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSModuleBlock
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSModuleBlock, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSModuleBlock, TState]] = js.undefined
}
object `569` {
  
  inline def apply[TState](): `569`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`569`[TState]]
  }
  
  extension [Self <: `569`[?], TState](x: Self & `569`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSModuleBlock], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSModuleBlock], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
