package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXNamespacedName
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXNamespacedName, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXNamespacedName, TState]] = js.undefined
}
object `184` {
  
  inline def apply[TState](): `184`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`184`[TState]]
  }
  
  extension [Self <: `184`[?], TState](x: Self & `184`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXNamespacedName], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXNamespacedName], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
