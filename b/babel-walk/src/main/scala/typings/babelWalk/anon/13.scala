package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeCallProperty
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeCallProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeCallProperty, TState]] = js.undefined
}
object `13` {
  
  inline def apply[TState](): `13`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`[?], TState] (val x: Self & `13`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectTypeCallProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectTypeCallProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
