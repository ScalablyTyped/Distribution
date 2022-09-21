package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassAccessorProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassAccessorProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassAccessorProperty, TState]] = js.undefined
}
object `255` {
  
  inline def apply[TState](): `255`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`255`[TState]]
  }
  
  extension [Self <: `255`[?], TState](x: Self & `255`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassAccessorProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassAccessorProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
