package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `149`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanLiteral, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[BooleanLiteral, TState]] = js.native
}
object `149` {
  
  @scala.inline
  def apply[TState](): `149`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`149`[TState]]
  }
  
  @scala.inline
  implicit class `149MutableBuilder`[Self <: `149`[_], TState] (val x: Self with `149`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BooleanLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BooleanLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
