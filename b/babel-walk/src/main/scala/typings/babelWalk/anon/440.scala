package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectMethod
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `440`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectMethod, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectMethod, TState]] = js.undefined
}
object `440` {
  
  inline def apply[TState](): `440`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`440`[TState]]
  }
  
  extension [Self <: `440`[?], TState](x: Self & `440`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectMethod], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectMethod], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
