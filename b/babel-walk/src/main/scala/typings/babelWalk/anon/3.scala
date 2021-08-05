package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumStringMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumStringMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumStringMember, TState]] = js.undefined
}
object `3` {
  
  inline def apply[TState](): `3`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[TState]]
  }
  
  extension [Self <: `3`[?], TState](x: Self & `3`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumStringMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumStringMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
