package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.RecordExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait RecordExpression_
  extends Expression
     with BaseNode {
  
  var properties: js.Array[ObjectProperty_ | SpreadElement_] = js.native
  
  @JSName("type")
  var type_RecordExpression_ : RecordExpression = js.native
}
object RecordExpression_ {
  
  @scala.inline
  def apply(properties: js.Array[ObjectProperty_ | SpreadElement_], `type`: RecordExpression): RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
