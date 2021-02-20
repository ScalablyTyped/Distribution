package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `240`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Block, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Block, TState]] = js.native
}
object `240` {
  
  @scala.inline
  def apply[TState](): `240`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`240`[TState]]
  }
  
  @scala.inline
  implicit class `240MutableBuilder`[Self <: `240`[_], TState] (val x: Self with `240`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Block], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
