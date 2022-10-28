package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UnaryLike
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `526`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UnaryLike, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UnaryLike, TState]] = js.undefined
}
object `526` {
  
  inline def apply[TState](): `526`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`526`[TState]]
  }
  
  extension [Self <: `526`[?], TState](x: Self & `526`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UnaryLike], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UnaryLike], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
