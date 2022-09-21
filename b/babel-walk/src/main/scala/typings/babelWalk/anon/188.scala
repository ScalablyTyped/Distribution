package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeProperty, TState]] = js.undefined
}
object `188` {
  
  inline def apply[TState](): `188`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`188`[TState]]
  }
  
  extension [Self <: `188`[?], TState](x: Self & `188`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
