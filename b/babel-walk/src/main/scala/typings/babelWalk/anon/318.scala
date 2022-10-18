package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSLiteralType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `318`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSLiteralType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSLiteralType, TState]] = js.undefined
}
object `318` {
  
  inline def apply[TState](): `318`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`318`[TState]]
  }
  
  extension [Self <: `318`[?], TState](x: Self & `318`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSLiteralType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSLiteralType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
