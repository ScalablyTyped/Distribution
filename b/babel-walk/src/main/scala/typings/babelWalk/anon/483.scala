package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Program
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `483`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Program, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Program, TState]] = js.undefined
}
object `483` {
  
  inline def apply[TState](): `483`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`483`[TState]]
  }
  
  extension [Self <: `483`[?], TState](x: Self & `483`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Program], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Program], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
