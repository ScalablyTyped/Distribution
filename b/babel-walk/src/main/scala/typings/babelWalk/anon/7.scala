package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterfaceTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterfaceTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InterfaceTypeAnnotation, TState]] = js.undefined
}
object `7` {
  
  inline def apply[TState](): `7`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[TState]]
  }
  
  extension [Self <: `7`[?], TState](x: Self & `7`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InterfaceTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InterfaceTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
