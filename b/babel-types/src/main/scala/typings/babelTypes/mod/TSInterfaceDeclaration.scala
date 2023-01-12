package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInterfaceDeclaration
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var body: TSInterfaceBody
  
  var declare: Boolean | Null
  
  var `extends`: js.Array[TSExpressionWithTypeArguments] | Null
  
  var id: Identifier_
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
}
object TSInterfaceDeclaration {
  
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(
    id: Identifier_,
    typeParameters: Null,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Null, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Null, extends_ : Unit, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(
    id: Identifier_,
    typeParameters: Unit,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Unit, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: Unit, extends_ : Unit, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  @JSImport("babel-types", "TSInterfaceDeclaration")
  @js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Unit, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSInterfaceDeclaration] (val x: Self) extends AnyVal {
    
    inline def setBody(value: TSInterfaceBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setExtends(value: js.Array[TSExpressionWithTypeArguments]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsVarargs(value: TSExpressionWithTypeArguments*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
