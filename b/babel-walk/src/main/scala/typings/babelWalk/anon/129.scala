package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportSpecifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportSpecifier, TState]] = js.undefined
}
object `129` {
  
  inline def apply[TState](): `129`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`129`[TState]]
  }
  
  extension [Self <: `129`[?], TState](x: Self & `129`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
