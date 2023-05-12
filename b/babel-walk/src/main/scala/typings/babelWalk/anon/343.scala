package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.LabeledStatement
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `343`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[LabeledStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[LabeledStatement, TState]] = js.undefined
}
object `343` {
  
  inline def apply[TState](): `343`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`343`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `343`[?], TState] (val x: Self & `343`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[LabeledStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[LabeledStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
