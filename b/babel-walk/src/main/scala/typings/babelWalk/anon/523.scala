package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassMethod
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `523`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassMethod, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassMethod, TState]] = js.undefined
}
object `523` {
  
  inline def apply[TState](): `523`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`523`[TState]]
  }
  
  extension [Self <: `523`[?], TState](x: Self & `523`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassMethod], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassMethod], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
