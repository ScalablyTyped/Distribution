package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `91`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeAnnotation, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeAnnotation, TState]] = js.native
}
object `91` {
  
  @scala.inline
  def apply[TState](): `91`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`91`[TState]]
  }
  
  @scala.inline
  implicit class `91MutableBuilder`[Self <: `91`[_], TState] (val x: Self with `91`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
