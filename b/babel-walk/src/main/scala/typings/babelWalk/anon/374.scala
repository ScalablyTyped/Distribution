package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSIntrinsicKeyword
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `374`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSIntrinsicKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSIntrinsicKeyword, TState]] = js.undefined
}
object `374` {
  
  inline def apply[TState](): `374`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`374`[TState]]
  }
  
  extension [Self <: `374`[?], TState](x: Self & `374`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSIntrinsicKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSIntrinsicKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
