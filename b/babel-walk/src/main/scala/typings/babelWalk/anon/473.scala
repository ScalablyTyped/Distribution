package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TypeofTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `473`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeofTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeofTypeAnnotation, TState]] = js.undefined
}
object `473` {
  
  inline def apply[TState](): `473`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`473`[TState]]
  }
  
  extension [Self <: `473`[?], TState](x: Self & `473`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeofTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeofTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
