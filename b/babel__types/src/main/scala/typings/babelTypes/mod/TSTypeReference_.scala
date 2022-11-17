package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeReference_
  extends StObject
     with BaseNode {
  
  var typeName: TSEntityName
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSTypeReference_ : "TSTypeReference"
}
object TSTypeReference_ {
  
  inline def apply(typeName: TSEntityName): TSTypeReference_ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[TSTypeReference_]
  }
  
  extension [Self <: TSTypeReference_](x: Self) {
    
    inline def setType(value: "TSTypeReference"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TSEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
