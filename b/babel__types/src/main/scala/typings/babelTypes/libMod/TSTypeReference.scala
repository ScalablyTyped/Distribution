package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeReference
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeName: TSEntityName
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypeReference: typings.babelTypes.babelTypesStrings.TSTypeReference
}
object TSTypeReference {
  
  inline def apply(typeName: TSEntityName): TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[TSTypeReference]
  }
  
  extension [Self <: TSTypeReference](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TSEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
