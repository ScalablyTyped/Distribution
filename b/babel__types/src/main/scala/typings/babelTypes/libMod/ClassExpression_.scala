package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassExpression_
  extends StObject
     with BaseNode {
  
  var body: ClassBody_
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var id: js.UndefOr[Identifier_ | Null] = js.undefined
  
  var implements: js.UndefOr[(js.Array[TSExpressionWithTypeArguments__ | ClassImplements_]) | Null] = js.undefined
  
  var mixins: js.UndefOr[InterfaceExtends_ | Null] = js.undefined
  
  var superClass: js.UndefOr[Expression | Null] = js.undefined
  
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation_ | TSTypeParameterInstantiation__ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_ClassExpression_ : "ClassExpression"
}
object ClassExpression_ {
  
  inline def apply(body: ClassBody_): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[ClassExpression_]
  }
  
  extension [Self <: ClassExpression_](x: Self) {
    
    inline def setBody(value: ClassBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImplements(value: js.Array[TSExpressionWithTypeArguments__ | ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsNull: Self = StObject.set(x, "implements", null)
    
    inline def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    inline def setImplementsVarargs(value: (TSExpressionWithTypeArguments__ | ClassImplements_)*): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setMixins(value: InterfaceExtends_): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsNull: Self = StObject.set(x, "mixins", null)
    
    inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    inline def setSuperClass(value: Expression): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassNull: Self = StObject.set(x, "superClass", null)
    
    inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
    
    inline def setSuperTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation__): Self = StObject.set(x, "superTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setSuperTypeParametersNull: Self = StObject.set(x, "superTypeParameters", null)
    
    inline def setSuperTypeParametersUndefined: Self = StObject.set(x, "superTypeParameters", js.undefined)
    
    inline def setType(value: "ClassExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
