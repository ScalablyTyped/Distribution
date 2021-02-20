package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `209`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanTypeAnnotation, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[BooleanTypeAnnotation, TState]] = js.native
}
object `209` {
  
  @scala.inline
  def apply[TState](): `209`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`209`[TState]]
  }
  
  @scala.inline
  implicit class `209MutableBuilder`[Self <: `209`[_], TState] (val x: Self with `209`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BooleanTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BooleanTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
