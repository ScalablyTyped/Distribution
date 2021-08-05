package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeReference
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `283`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
}
object `283` {
  
  inline def apply[TState](): `283`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`283`[TState]]
  }
  
  extension [Self <: `283`[?], TState](x: Self & `283`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
