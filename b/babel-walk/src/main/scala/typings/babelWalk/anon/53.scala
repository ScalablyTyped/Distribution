package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterfaceDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `53`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterfaceDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[InterfaceDeclaration, TState]] = js.native
}
object `53` {
  
  @scala.inline
  def apply[TState](): `53`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`53`[TState]]
  }
  
  @scala.inline
  implicit class `53MutableBuilder`[Self <: `53`[_], TState] (val x: Self with `53`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[InterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[InterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
