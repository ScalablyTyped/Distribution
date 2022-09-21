package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInterfaceDeclaration
  extends StObject
     with BaseNode
     with Declaration
     with Node
     with Statement
     with TypeScript {
  
  var body: TSInterfaceBody
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArguments] | Null] = js.undefined
  
  var id: Identifier_
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null] = js.undefined
  
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
}
object TSInterfaceDeclaration {
  
  inline def apply(body: TSInterfaceBody, id: Identifier_): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
  
  extension [Self <: TSInterfaceDeclaration](x: Self) {
    
    inline def setBody(value: TSInterfaceBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setExtends(value: js.Array[TSExpressionWithTypeArguments]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: TSExpressionWithTypeArguments*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
