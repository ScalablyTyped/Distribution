package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ArrayTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `93`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ArrayTypeAnnotation, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ArrayTypeAnnotation, TState]] = js.native
}
object `93` {
  
  @scala.inline
  def apply[TState](): `93`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`93`[TState]]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`[_], TState] (val x: Self with `93`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ArrayTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ArrayTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
