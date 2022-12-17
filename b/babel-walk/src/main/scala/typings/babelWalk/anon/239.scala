package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DoWhileStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DoWhileStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DoWhileStatement, TState]] = js.undefined
}
object `239` {
  
  inline def apply[TState](): `239`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`239`[TState]]
  }
  
  extension [Self <: `239`[?], TState](x: Self & `239`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DoWhileStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DoWhileStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
