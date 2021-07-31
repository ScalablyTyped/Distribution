package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ClassExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ClassExpression_
  extends StObject
     with BaseNode
     with Class
     with Expression
     with Scopable {
  
  var body: ClassBody_
  
  var decorators: js.Array[Decorator_] | Null
  
  var id: Identifier_ | Null
  
  var implements: (js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]) | Null
  
  var mixins: InterfaceExtends_ | Null
  
  var superClass: Expression | Null
  
  var superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_ClassExpression_ : ClassExpression
}
object ClassExpression_ {
  
  @scala.inline
  def apply(body: ClassBody_): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[ClassExpression_]
  }
  
  @scala.inline
  implicit class ClassExpression_MutableBuilder[Self <: ClassExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ClassBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setImplements(value: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsNull: Self = StObject.set(x, "implements", null)
    
    @scala.inline
    def setImplementsVarargs(value: (TSExpressionWithTypeArguments_ | ClassImplements_)*): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: InterfaceExtends_): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsNull: Self = StObject.set(x, "mixins", null)
    
    @scala.inline
    def setSuperClass(value: Expression): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClassNull: Self = StObject.set(x, "superClass", null)
    
    @scala.inline
    def setSuperTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = StObject.set(x, "superTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperTypeParametersNull: Self = StObject.set(x, "superTypeParameters", null)
    
    @scala.inline
    def setType(value: ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
