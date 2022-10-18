package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumNumberMember
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `541`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumNumberMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumNumberMember, TState]] = js.undefined
}
object `541` {
  
  inline def apply[TState](): `541`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`541`[TState]]
  }
  
  extension [Self <: `541`[?], TState](x: Self & `541`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumNumberMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumNumberMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
