package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PatternLike
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PatternLike, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PatternLike, TState]] = js.undefined
}
object `120` {
  
  inline def apply[TState](): `120`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`120`[TState]]
  }
  
  extension [Self <: `120`[?], TState](x: Self & `120`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[PatternLike], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[PatternLike], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
