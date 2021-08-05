package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSBigIntKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSBigIntKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSBigIntKeyword, TState]] = js.undefined
}
object `58` {
  
  inline def apply[TState](): `58`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`58`[TState]]
  }
  
  extension [Self <: `58`[?], TState](x: Self & `58`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSBigIntKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSBigIntKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
