package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSX
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSX, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSX, TState]] = js.undefined
}
object `31` {
  
  inline def apply[TState](): `31`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`[TState]]
  }
  
  extension [Self <: `31`[?], TState](x: Self & `31`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSX], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSX], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
