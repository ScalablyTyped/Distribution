package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ClassDeclaration_
  extends StObject
     with BaseNode
     with Class
     with Declaration
     with Scopable
     with Statement {
  
  var `abstract`: Boolean | Null
  
  var body: ClassBody_
  
  var declare: Boolean | Null
  
  var decorators: js.Array[Decorator_] | Null
  
  var id: Identifier_
  
  var implements: (js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]) | Null
  
  var mixins: InterfaceExtends_ | Null
  
  var superClass: Expression | Null
  
  var superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_ClassDeclaration_ : ClassDeclaration
}
object ClassDeclaration_ {
  
  @scala.inline
  def apply(body: ClassBody_, id: Identifier_): ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, decorators = null, end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[ClassDeclaration_]
  }
  
  @scala.inline
  implicit class ClassDeclaration_MutableBuilder[Self <: ClassDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    @scala.inline
    def setBody(value: ClassBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
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
    def setType(value: ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
