package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSTypeAliasDeclaration
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `405`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSTypeAliasDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSTypeAliasDeclaration, TState]] = js.undefined
}
object `405` {
  
  inline def apply[TState](): `405`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`405`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `405`[?], TState] (val x: Self & `405`[TState]) extends AnyVal {
    
    inline def setEnter(
      value: (/* node */ NodeType[TSTypeAliasDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[TSTypeAliasDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
