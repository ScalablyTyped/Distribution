package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterExit[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Loop, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Loop, TState]] = js.undefined
}
object EnterExit {
  
  inline def apply[TState](): EnterExit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterExit[TState]]
  }
  
  extension [Self <: EnterExit[?], TState](x: Self & EnterExit[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
