package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.StringLiteralTypeAnnotation
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `267`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[StringLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[StringLiteralTypeAnnotation, TState]] = js.undefined
}
object `267` {
  
  inline def apply[TState](): `267`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`267`[TState]]
  }
  
  extension [Self <: `267`[?], TState](x: Self & `267`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[StringLiteralTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[StringLiteralTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
