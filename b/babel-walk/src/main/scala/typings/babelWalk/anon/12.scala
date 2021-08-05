package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeCallProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeCallProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeCallProperty, TState]] = js.undefined
}
object `12` {
  
  inline def apply[TState](): `12`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`[TState]]
  }
  
  extension [Self <: `12`[?], TState](x: Self & `12`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeCallProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeCallProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
