package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSSatisfiesExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `303`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSSatisfiesExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSSatisfiesExpression, TState]] = js.undefined
}
object `303` {
  
  inline def apply[TState](): `303`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`303`[TState]]
  }
  
  extension [Self <: `303`[?], TState](x: Self & `303`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSSatisfiesExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSSatisfiesExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
