package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeReference
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `293`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
}
object `293` {
  
  inline def apply[TState](): `293`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`293`[TState]]
  }
  
  extension [Self <: `293`[?], TState](x: Self & `293`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
