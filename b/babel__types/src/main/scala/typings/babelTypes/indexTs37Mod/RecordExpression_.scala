package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.RecordExpression
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
  implicit class RecordExpression_Ops[Self <: RecordExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectProperty_ | SpreadElement_)*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectProperty_ | SpreadElement_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RecordExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
