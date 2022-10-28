package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeProperty
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `487`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeProperty, TState]] = js.undefined
}
object `487` {
  
  inline def apply[TState](): `487`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`487`[TState]]
  }
  
  extension [Self <: `487`[?], TState](x: Self & `487`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
