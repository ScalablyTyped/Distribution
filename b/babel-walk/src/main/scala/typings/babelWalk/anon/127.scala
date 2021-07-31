package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBooleanMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBooleanMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBooleanMember, TState]] = js.undefined
}
object `127` {
  
  @scala.inline
  def apply[TState](): `127`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`127`[TState]]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`[?], TState] (val x: Self & `127`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumBooleanMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumBooleanMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
