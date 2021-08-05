package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportDefaultSpecifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportDefaultSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportDefaultSpecifier, TState]] = js.undefined
}
object `19` {
  
  inline def apply[TState](): `19`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[TState]]
  }
  
  extension [Self <: `19`[?], TState](x: Self & `19`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
