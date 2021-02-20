package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TaggedTemplateExpression_
  extends Expression
     with BaseNode {
  
  var quasi: TemplateLiteral_ = js.native
  
  var tag: Expression = js.native
  
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression = js.native
}
object TaggedTemplateExpression_ {
  
  @scala.inline
  def apply(quasi: TemplateLiteral_, tag: Expression, `type`: TaggedTemplateExpression): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
  
  @scala.inline
  implicit class TaggedTemplateExpression_MutableBuilder[Self <: TaggedTemplateExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasi(value: TemplateLiteral_): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
