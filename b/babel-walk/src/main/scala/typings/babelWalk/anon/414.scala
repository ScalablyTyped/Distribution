package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Terminatorless
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `414`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Terminatorless, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Terminatorless, TState]] = js.undefined
}
object `414` {
  
  inline def apply[TState](): `414`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`414`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `414`[?], TState] (val x: Self & `414`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[Terminatorless], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Terminatorless], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
