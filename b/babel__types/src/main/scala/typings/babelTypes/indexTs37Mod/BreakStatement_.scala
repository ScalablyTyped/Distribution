package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait BreakStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null
  
  @JSName("type")
  var type_BreakStatement_ : BreakStatement
}
object BreakStatement_ {
  
  @scala.inline
  def apply(): BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement_]
  }
  
  @scala.inline
  implicit class BreakStatement_MutableBuilder[Self <: BreakStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setType(value: BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
