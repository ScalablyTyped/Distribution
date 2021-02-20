package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareTypeAlias
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `189`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareTypeAlias, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DeclareTypeAlias, TState]] = js.native
}
object `189` {
  
  @scala.inline
  def apply[TState](): `189`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`189`[TState]]
  }
  
  @scala.inline
  implicit class `189MutableBuilder`[Self <: `189`[_], TState] (val x: Self with `189`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareTypeAlias], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareTypeAlias], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
