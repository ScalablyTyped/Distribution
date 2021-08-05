package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterExit[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Loop, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Loop, TState]] = js.undefined
}
object EnterExit {
  
  inline def apply[TState](): EnterExit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterExit[TState]]
  }
  
  extension [Self <: EnterExit[?], TState](x: Self & EnterExit[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Loop], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Loop], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
