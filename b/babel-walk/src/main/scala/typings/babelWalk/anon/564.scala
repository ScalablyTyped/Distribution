package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectPattern
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `564`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectPattern, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectPattern, TState]] = js.undefined
}
object `564` {
  
  inline def apply[TState](): `564`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`564`[TState]]
  }
  
  extension [Self <: `564`[?], TState](x: Self & `564`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectPattern], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectPattern], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
