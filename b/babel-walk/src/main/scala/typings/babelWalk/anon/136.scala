package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSExternalModuleReference
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExternalModuleReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSExternalModuleReference, TState]] = js.undefined
}
object `136` {
  
  inline def apply[TState](): `136`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`136`[TState]]
  }
  
  extension [Self <: `136`[?], TState](x: Self & `136`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSExternalModuleReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSExternalModuleReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
