package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumNumberMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumNumberMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumNumberMember, TState]] = js.undefined
}
object `244` {
  
  inline def apply[TState](): `244`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`244`[TState]]
  }
  
  extension [Self <: `244`[?], TState](x: Self & `244`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumNumberMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumNumberMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
