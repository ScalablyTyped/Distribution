package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `476`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
}
object `476` {
  
  inline def apply[TState](): `476`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`476`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `476`[?], TState] (val x: Self & `476`[TState]) extends AnyVal {
    
    inline def setEnter(
      value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
