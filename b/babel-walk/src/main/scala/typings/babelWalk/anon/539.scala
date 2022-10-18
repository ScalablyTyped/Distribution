package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSMethodSignature
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `539`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSMethodSignature, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSMethodSignature, TState]] = js.undefined
}
object `539` {
  
  inline def apply[TState](): `539`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`539`[TState]]
  }
  
  extension [Self <: `539`[?], TState](x: Self & `539`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSMethodSignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSMethodSignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
