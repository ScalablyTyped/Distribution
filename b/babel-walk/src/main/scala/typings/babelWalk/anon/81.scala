package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.QualifiedTypeIdentifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[QualifiedTypeIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[QualifiedTypeIdentifier, TState]] = js.undefined
}
object `81` {
  
  @scala.inline
  def apply[TState](): `81`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`81`[TState]]
  }
  
  @scala.inline
  implicit class `81MutableBuilder`[Self <: `81`[?], TState] (val x: Self & `81`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[QualifiedTypeIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[QualifiedTypeIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
