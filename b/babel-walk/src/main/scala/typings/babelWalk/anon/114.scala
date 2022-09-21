package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSStringKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSStringKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSStringKeyword, TState]] = js.undefined
}
object `114` {
  
  inline def apply[TState](): `114`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`114`[TState]]
  }
  
  extension [Self <: `114`[?], TState](x: Self & `114`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSStringKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSStringKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
