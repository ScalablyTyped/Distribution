package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait DebuggerStatement_
  extends StObject
     with BaseNode
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement_ : DebuggerStatement
}
object DebuggerStatement_ {
  
  inline def apply(): DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[DebuggerStatement_]
  }
  
  extension [Self <: DebuggerStatement_](x: Self) {
    
    inline def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
