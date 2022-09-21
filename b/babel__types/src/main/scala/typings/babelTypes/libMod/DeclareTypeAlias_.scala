package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareTypeAlias_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var id: Identifier_
  
  var right: FlowType
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | Null] = js.undefined
  
  @JSName("type")
  var type_DeclareTypeAlias_ : DeclareTypeAlias
}
object DeclareTypeAlias_ {
  
  inline def apply(id: Identifier_, right: FlowType): DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[DeclareTypeAlias_]
  }
  
  extension [Self <: DeclareTypeAlias_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRight(value: FlowType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
