package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSConstructSignatureDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `132`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSConstructSignatureDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSConstructSignatureDeclaration, TState]] = js.native
}
object `132` {
  
  @scala.inline
  def apply[TState](): `132`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`132`[TState]]
  }
  
  @scala.inline
  implicit class `132MutableBuilder`[Self <: `132`[_], TState] (val x: Self with `132`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSConstructSignatureDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSConstructSignatureDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
