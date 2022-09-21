package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
}
object `175` {
  
  inline def apply[TState](): `175`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`175`[TState]]
  }
  
  extension [Self <: `175`[?], TState](x: Self & `175`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
