package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumStringBody
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `489`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumStringBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumStringBody, TState]] = js.undefined
}
object `489` {
  
  inline def apply[TState](): `489`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`489`[TState]]
  }
  
  extension [Self <: `489`[?], TState](x: Self & `489`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumStringBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumStringBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
