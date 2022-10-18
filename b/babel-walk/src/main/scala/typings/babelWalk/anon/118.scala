package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.DeclareFunction
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[DeclareFunction, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[DeclareFunction, TState]] = js.undefined
}
object `118` {
  
  inline def apply[TState](): `118`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`118`[TState]]
  }
  
  extension [Self <: `118`[?], TState](x: Self & `118`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareFunction], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareFunction], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
