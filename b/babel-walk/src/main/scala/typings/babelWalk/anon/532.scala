package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ClassImplements
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `532`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ClassImplements, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ClassImplements, TState]] = js.undefined
}
object `532` {
  
  inline def apply[TState](): `532`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`532`[TState]]
  }
  
  extension [Self <: `532`[?], TState](x: Self & `532`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassImplements], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassImplements], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
