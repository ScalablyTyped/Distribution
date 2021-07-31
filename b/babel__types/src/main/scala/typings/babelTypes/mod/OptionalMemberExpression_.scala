package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OptionalMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait OptionalMemberExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var computed: Boolean
  
  var `object`: Expression
  
  var optional: Boolean
  
  var property: Expression | Identifier_
  
  @JSName("type")
  var type_OptionalMemberExpression_ : OptionalMemberExpression
}
object OptionalMemberExpression_ {
  
  @scala.inline
  def apply(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[OptionalMemberExpression_]
  }
  
  @scala.inline
  implicit class OptionalMemberExpression_MutableBuilder[Self <: OptionalMemberExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression | Identifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OptionalMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
