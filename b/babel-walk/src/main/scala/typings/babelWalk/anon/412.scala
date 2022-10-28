package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Terminatorless
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `412`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Terminatorless, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Terminatorless, TState]] = js.undefined
}
object `412` {
  
  inline def apply[TState](): `412`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`412`[TState]]
  }
  
  extension [Self <: `412`[?], TState](x: Self & `412`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Terminatorless], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Terminatorless], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
