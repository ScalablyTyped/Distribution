package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSOptionalType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
}
object `212` {
  
  inline def apply[TState](): `212`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`212`[TState]]
  }
  
  extension [Self <: `212`[?], TState](x: Self & `212`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSOptionalType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSOptionalType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
