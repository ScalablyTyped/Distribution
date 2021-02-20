package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterExit[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Loop, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Loop, TState]] = js.native
}
object EnterExit {
  
  @scala.inline
  def apply[TState](): EnterExit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterExit[TState]]
  }
  
  @scala.inline
  implicit class EnterExitMutableBuilder[Self <: EnterExit[_], TState] (val x: Self with EnterExit[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Loop], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Loop], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
