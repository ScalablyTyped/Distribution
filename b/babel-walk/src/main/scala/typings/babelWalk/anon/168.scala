package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
}
object `168` {
  
  inline def apply[TState](): `168`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`168`[TState]]
  }
  
  extension [Self <: `168`[?], TState](x: Self & `168`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
