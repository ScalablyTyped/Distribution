package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSUnionType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `402`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSUnionType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSUnionType, TState]] = js.undefined
}
object `402` {
  
  inline def apply[TState](): `402`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`402`[TState]]
  }
  
  extension [Self <: `402`[?], TState](x: Self & `402`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSUnionType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSUnionType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
