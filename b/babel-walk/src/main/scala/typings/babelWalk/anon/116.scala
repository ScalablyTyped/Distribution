package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TopicReference
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TopicReference, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TopicReference, TState]] = js.undefined
}
object `116` {
  
  inline def apply[TState](): `116`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`116`[TState]]
  }
  
  extension [Self <: `116`[?], TState](x: Self & `116`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TopicReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TopicReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
