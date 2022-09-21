package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSIndexSignature
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSIndexSignature, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSIndexSignature, TState]] = js.undefined
}
object `247` {
  
  inline def apply[TState](): `247`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`247`[TState]]
  }
  
  extension [Self <: `247`[?], TState](x: Self & `247`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSIndexSignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSIndexSignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
