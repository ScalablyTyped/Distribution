package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportDefaultSpecifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `317`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportDefaultSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportDefaultSpecifier, TState]] = js.undefined
}
object `317` {
  
  inline def apply[TState](): `317`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`317`[TState]]
  }
  
  extension [Self <: `317`[?], TState](x: Self & `317`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportDefaultSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
