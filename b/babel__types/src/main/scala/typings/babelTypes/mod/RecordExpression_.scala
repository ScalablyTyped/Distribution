package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.RecordExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait RecordExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var properties: js.Array[ObjectProperty_ | SpreadElement_]
  
  @JSName("type")
  var type_RecordExpression_ : RecordExpression
}
object RecordExpression_ {
  
  @scala.inline
  def apply(properties: js.Array[ObjectProperty_ | SpreadElement_]): RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[RecordExpression_]
  }
  
  @scala.inline
  implicit class RecordExpression_MutableBuilder[Self <: RecordExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[ObjectProperty_ | SpreadElement_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectProperty_ | SpreadElement_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RecordExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
