package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSVoidKeyword
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSVoidKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSVoidKeyword, TState]] = js.undefined
}
object `67` {
  
  inline def apply[TState](): `67`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `67`[?], TState] (val x: Self & `67`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSVoidKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSVoidKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
