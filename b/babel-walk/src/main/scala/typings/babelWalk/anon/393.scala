package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.MetaProperty
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `393`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[MetaProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[MetaProperty, TState]] = js.undefined
}
object `393` {
  
  inline def apply[TState](): `393`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`393`[TState]]
  }
  
  extension [Self <: `393`[?], TState](x: Self & `393`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[MetaProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[MetaProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
