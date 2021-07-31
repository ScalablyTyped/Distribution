package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSInterfaceDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Statement {
  
  var body: TSInterfaceBody_
  
  var declare: Boolean | Null
  
  var `extends`: js.Array[TSExpressionWithTypeArguments_] | Null
  
  var id: Identifier_
  
  var typeParameters: TSTypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSInterfaceDeclaration_ : TSInterfaceDeclaration
}
object TSInterfaceDeclaration_ {
  
  @scala.inline
  def apply(body: TSInterfaceBody_, id: Identifier_): TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[TSInterfaceDeclaration_]
  }
  
  @scala.inline
  implicit class TSInterfaceDeclaration_MutableBuilder[Self <: TSInterfaceDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: TSInterfaceBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setExtends(value: js.Array[TSExpressionWithTypeArguments_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsVarargs(value: TSExpressionWithTypeArguments_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
