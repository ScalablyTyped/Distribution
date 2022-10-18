package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSQualifiedName
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `331`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSQualifiedName, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSQualifiedName, TState]] = js.undefined
}
object `331` {
  
  inline def apply[TState](): `331`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`331`[TState]]
  }
  
  extension [Self <: `331`[?], TState](x: Self & `331`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSQualifiedName], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSQualifiedName], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
