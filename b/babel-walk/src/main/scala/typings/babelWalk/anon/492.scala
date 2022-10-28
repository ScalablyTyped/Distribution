package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.NumberTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `492`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[NumberTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[NumberTypeAnnotation, TState]] = js.undefined
}
object `492` {
  
  inline def apply[TState](): `492`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`492`[TState]]
  }
  
  extension [Self <: `492`[?], TState](x: Self & `492`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[NumberTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[NumberTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
