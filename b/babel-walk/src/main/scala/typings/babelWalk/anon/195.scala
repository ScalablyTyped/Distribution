package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForOfStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
}
object `195` {
  
  inline def apply[TState](): `195`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`195`[TState]]
  }
  
  extension [Self <: `195`[?], TState](x: Self & `195`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
