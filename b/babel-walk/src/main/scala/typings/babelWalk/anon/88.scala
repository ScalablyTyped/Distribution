package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TemplateLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TemplateLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TemplateLiteral, TState]] = js.undefined
}
object `88` {
  
  inline def apply[TState](): `88`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`88`[TState]]
  }
  
  extension [Self <: `88`[?], TState](x: Self & `88`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TemplateLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TemplateLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
