package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.LabeledStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait LabeledStatement_
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var label: Identifier_
  
  @JSName("type")
  var type_LabeledStatement_ : LabeledStatement
}
object LabeledStatement_ {
  
  @scala.inline
  def apply(body: Statement, label: Identifier_): LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[LabeledStatement_]
  }
  
  @scala.inline
  implicit class LabeledStatement_MutableBuilder[Self <: LabeledStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LabeledStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
