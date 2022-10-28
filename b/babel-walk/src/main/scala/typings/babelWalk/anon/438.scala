package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportAttribute
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
}
object `438` {
  
  inline def apply[TState](): `438`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`438`[TState]]
  }
  
  extension [Self <: `438`[?], TState](x: Self & `438`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportAttribute], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportAttribute], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
