package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSBigIntKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSBigIntKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSBigIntKeyword, TState]] = js.undefined
}
object `60` {
  
  inline def apply[TState](): `60`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`[TState]]
  }
  
  extension [Self <: `60`[?], TState](x: Self & `60`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSBigIntKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSBigIntKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
