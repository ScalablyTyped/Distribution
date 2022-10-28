package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSExportAssignment
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `470`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExportAssignment, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSExportAssignment, TState]] = js.undefined
}
object `470` {
  
  inline def apply[TState](): `470`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`470`[TState]]
  }
  
  extension [Self <: `470`[?], TState](x: Self & `470`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSExportAssignment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSExportAssignment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
