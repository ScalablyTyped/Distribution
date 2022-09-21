package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSImportEqualsDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `486`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSImportEqualsDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSImportEqualsDeclaration, TState]] = js.undefined
}
object `486` {
  
  inline def apply[TState](): `486`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`486`[TState]]
  }
  
  extension [Self <: `486`[?], TState](x: Self & `486`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[TSImportEqualsDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[TSImportEqualsDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
