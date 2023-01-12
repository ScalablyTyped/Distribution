package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareOpaqueType_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var id: Identifier_
  
  var impltype: js.UndefOr[FlowType | Null] = js.undefined
  
  var supertype: js.UndefOr[FlowType | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | Null] = js.undefined
  
  @JSName("type")
  var type_DeclareOpaqueType_ : DeclareOpaqueType
}
object DeclareOpaqueType_ {
  
  inline def apply(id: Identifier_): DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[DeclareOpaqueType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclareOpaqueType_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpltype(value: FlowType): Self = StObject.set(x, "impltype", value.asInstanceOf[js.Any])
    
    inline def setImpltypeNull: Self = StObject.set(x, "impltype", null)
    
    inline def setImpltypeUndefined: Self = StObject.set(x, "impltype", js.undefined)
    
    inline def setSupertype(value: FlowType): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    inline def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    inline def setSupertypeUndefined: Self = StObject.set(x, "supertype", js.undefined)
    
    inline def setType(value: DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
