package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTemplateExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var quasi: TemplateLiteral_
  
  var tag: Expression
  
  var typeParameters: js.UndefOr[TypeParameterInstantiation_ | TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression
}
object TaggedTemplateExpression_ {
  
  inline def apply(quasi: TemplateLiteral_, tag: Expression): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
  
  extension [Self <: TaggedTemplateExpression_](x: Self) {
    
    inline def setQuasi(value: TemplateLiteral_): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
