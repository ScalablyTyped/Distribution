package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EmptyStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EmptyStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EmptyStatement, TState]] = js.undefined
}
object `123` {
  
  inline def apply[TState](): `123`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`123`[TState]]
  }
  
  extension [Self <: `123`[?], TState](x: Self & `123`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EmptyStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EmptyStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
