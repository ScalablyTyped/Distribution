package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ModuleDeclaration
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ModuleDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ModuleDeclaration, TState]] = js.undefined
}
object `144` {
  
  inline def apply[TState](): `144`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`144`[TState]]
  }
  
  extension [Self <: `144`[?], TState](x: Self & `144`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ModuleDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ModuleDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
