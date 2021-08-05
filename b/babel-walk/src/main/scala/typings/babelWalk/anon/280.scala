package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBody
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `280`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
}
object `280` {
  
  inline def apply[TState](): `280`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`280`[TState]]
  }
  
  extension [Self <: `280`[?], TState](x: Self & `280`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
