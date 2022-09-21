package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSUnknownKeyword
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `359`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSUnknownKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSUnknownKeyword, TState]] = js.undefined
}
object `359` {
  
  inline def apply[TState](): `359`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`359`[TState]]
  }
  
  extension [Self <: `359`[?], TState](x: Self & `359`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSUnknownKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSUnknownKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
