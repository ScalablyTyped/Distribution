package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PipelinePrimaryTopicReference
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `333`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PipelinePrimaryTopicReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PipelinePrimaryTopicReference, TState]] = js.undefined
}
object `333` {
  
  inline def apply[TState](): `333`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`333`[TState]]
  }
  
  extension [Self <: `333`[?], TState](x: Self & `333`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
