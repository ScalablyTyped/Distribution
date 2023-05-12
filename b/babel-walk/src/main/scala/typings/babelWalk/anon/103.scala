package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForXStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.undefined
}
object `103` {
  
  inline def apply[TState](): `103`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`103`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `103`[?], TState] (val x: Self & `103`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
