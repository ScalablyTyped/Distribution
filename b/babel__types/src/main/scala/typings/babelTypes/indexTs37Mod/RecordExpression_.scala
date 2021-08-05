package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.RecordExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait RecordExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var properties: js.Array[ObjectProperty_ | SpreadElement_]
  
  @JSName("type")
  var type_RecordExpression_ : RecordExpression
}
object RecordExpression_ {
  
  inline def apply(properties: js.Array[ObjectProperty_ | SpreadElement_]): RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[RecordExpression_]
  }
  
  extension [Self <: RecordExpression_](x: Self) {
    
    inline def setProperties(value: js.Array[ObjectProperty_ | SpreadElement_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectProperty_ | SpreadElement_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setType(value: RecordExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
