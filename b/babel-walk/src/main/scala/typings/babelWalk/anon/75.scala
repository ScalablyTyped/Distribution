package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.AssignmentPattern
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[AssignmentPattern, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[AssignmentPattern, TState]] = js.undefined
}
object `75` {
  
  inline def apply[TState](): `75`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`75`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `75`[?], TState] (val x: Self & `75`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[AssignmentPattern], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[AssignmentPattern], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
