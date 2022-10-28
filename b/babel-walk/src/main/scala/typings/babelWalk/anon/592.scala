package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeReference
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `592`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeReference, TState]] = js.undefined
}
object `592` {
  
  inline def apply[TState](): `592`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`592`[TState]]
  }
  
  extension [Self <: `592`[?], TState](x: Self & `592`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
