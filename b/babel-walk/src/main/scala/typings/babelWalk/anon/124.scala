package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EmptyStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EmptyStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EmptyStatement, TState]] = js.undefined
}
object `124` {
  
  inline def apply[TState](): `124`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`124`[TState]]
  }
  
  extension [Self <: `124`[?], TState](x: Self & `124`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EmptyStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EmptyStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
