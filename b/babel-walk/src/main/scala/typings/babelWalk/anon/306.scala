package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterfaceTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `306`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterfaceTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InterfaceTypeAnnotation, TState]] = js.undefined
}
object `306` {
  
  inline def apply[TState](): `306`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`306`[TState]]
  }
  
  extension [Self <: `306`[?], TState](x: Self & `306`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InterfaceTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InterfaceTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
