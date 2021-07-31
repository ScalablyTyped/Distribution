package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ContinueStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null
  
  @JSName("type")
  var type_ContinueStatement_ : ContinueStatement
}
object ContinueStatement_ {
  
  @scala.inline
  def apply(): ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  @scala.inline
  implicit class ContinueStatement_MutableBuilder[Self <: ContinueStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setType(value: ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
