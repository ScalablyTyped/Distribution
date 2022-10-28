package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSDeclareMethod
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSDeclareMethod, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSDeclareMethod, TState]] = js.undefined
}
object `87` {
  
  inline def apply[TState](): `87`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`87`[TState]]
  }
  
  extension [Self <: `87`[?], TState](x: Self & `87`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSDeclareMethod], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSDeclareMethod], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
