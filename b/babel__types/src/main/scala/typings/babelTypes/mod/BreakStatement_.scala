package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait BreakStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Standardized
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null
  
  @JSName("type")
  var type_BreakStatement_ : BreakStatement
}
object BreakStatement_ {
  
  inline def apply(): BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement_]
  }
  
  extension [Self <: BreakStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setType(value: BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
