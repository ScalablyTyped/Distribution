package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassImplements
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassImplements, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassImplements, TState]] = js.undefined
}
object `245` {
  
  inline def apply[TState](): `245`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`245`[TState]]
  }
  
  extension [Self <: `245`[?], TState](x: Self & `245`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassImplements], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassImplements], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
