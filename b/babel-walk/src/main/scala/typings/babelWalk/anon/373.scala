package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.EnumDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `373`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[EnumDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[EnumDeclaration, TState]] = js.undefined
}
object `373` {
  
  inline def apply[TState](): `373`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`373`[TState]]
  }
  
  extension [Self <: `373`[?], TState](x: Self & `373`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
