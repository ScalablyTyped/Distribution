package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
}
object Enter {
  
  inline def apply[TState](): Enter[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enter[?], TState] (val x: Self & Enter[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
