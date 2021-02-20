package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectExpression_
  extends Expression
     with BaseNode {
  
  var properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_] = js.native
  
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression = js.native
}
object ObjectExpression_ {
  
  @scala.inline
  def apply(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_], `type`: ObjectExpression): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression_]
  }
  
  @scala.inline
  implicit class ObjectExpression_MutableBuilder[Self <: ObjectExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectMethod_ | ObjectProperty_ | SpreadElement_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
