package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TaggedTemplateExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  var quasi: TemplateLiteral_
  
  var tag: Expression
  
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression
}
object TaggedTemplateExpression_ {
  
  inline def apply(quasi: TemplateLiteral_, tag: Expression): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaggedTemplateExpression_] (val x: Self) extends AnyVal {
    
    inline def setQuasi(value: TemplateLiteral_): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
