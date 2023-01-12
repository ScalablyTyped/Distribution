package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeReference
  extends StObject
     with Node
     with TSType {
  
  var typeName: TSEntityName
  
  var typeParameters: TypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSTypeReference: typings.babelTypes.babelTypesStrings.TSTypeReference
}
object TSTypeReference {
  
  @JSImport("babel-types", "TSTypeReference")
  @js.native
  def apply(typeName: TSEntityName): TSTypeReference = js.native
  @JSImport("babel-types", "TSTypeReference")
  @js.native
  def apply(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeReference] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TSEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
