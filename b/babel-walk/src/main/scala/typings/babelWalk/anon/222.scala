package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSInterfaceDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInterfaceDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInterfaceDeclaration, TState]] = js.undefined
}
object `222` {
  
  inline def apply[TState](): `222`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`222`[TState]]
  }
  
  extension [Self <: `222`[?], TState](x: Self & `222`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInterfaceDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
