package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSImportEqualsDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSImportEqualsDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSImportEqualsDeclaration, TState]] = js.undefined
}
object `189` {
  
  inline def apply[TState](): `189`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`189`[TState]]
  }
  
  extension [Self <: `189`[?], TState](x: Self & `189`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSImportEqualsDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSImportEqualsDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
