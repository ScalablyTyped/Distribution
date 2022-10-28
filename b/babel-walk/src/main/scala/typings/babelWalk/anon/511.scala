package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Miscellaneous
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `511`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Miscellaneous, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Miscellaneous, TState]] = js.undefined
}
object `511` {
  
  inline def apply[TState](): `511`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`511`[TState]]
  }
  
  extension [Self <: `511`[?], TState](x: Self & `511`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Miscellaneous], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Miscellaneous], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
