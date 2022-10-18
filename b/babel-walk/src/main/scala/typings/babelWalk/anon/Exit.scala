package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSArrayType
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSArrayType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSArrayType, TState]] = js.undefined
}
object Exit {
  
  inline def apply[TState](): Exit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit[TState]]
  }
  
  extension [Self <: Exit[?], TState](x: Self & Exit[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSArrayType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSArrayType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
