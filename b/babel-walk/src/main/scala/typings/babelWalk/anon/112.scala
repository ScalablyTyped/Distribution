package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Identifier
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Identifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Identifier, TState]] = js.undefined
}
object `112` {
  
  inline def apply[TState](): `112`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`112`[TState]]
  }
  
  extension [Self <: `112`[?], TState](x: Self & `112`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Identifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Identifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
