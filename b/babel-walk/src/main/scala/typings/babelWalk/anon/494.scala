package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForOfStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `494`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
}
object `494` {
  
  inline def apply[TState](): `494`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`494`[TState]]
  }
  
  extension [Self <: `494`[?], TState](x: Self & `494`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
