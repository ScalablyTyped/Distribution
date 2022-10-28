package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Class
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `499`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Class, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Class, TState]] = js.undefined
}
object `499` {
  
  inline def apply[TState](): `499`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`499`[TState]]
  }
  
  extension [Self <: `499`[?], TState](x: Self & `499`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Class], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Class], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
