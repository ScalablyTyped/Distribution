package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ImportDefaultSpecifier
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ImportDefaultSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ImportDefaultSpecifier, TState]] = js.undefined
}
object `20` {
  
  inline def apply[TState](): `20`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`20`[TState]]
  }
  
  extension [Self <: `20`[?], TState](x: Self & `20`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[ImportDefaultSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[ImportDefaultSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
