package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Standardized
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Standardized, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Standardized, TState]] = js.undefined
}
object `14` {
  
  inline def apply[TState](): `14`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`[TState]]
  }
  
  extension [Self <: `14`[?], TState](x: Self & `14`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Standardized], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Standardized], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
