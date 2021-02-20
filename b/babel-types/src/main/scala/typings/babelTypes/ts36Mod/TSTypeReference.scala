package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeReference
  extends Node
     with TSType {
  
  var typeName: TSEntityName = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_TSTypeReference: typings.babelTypes.babelTypesStrings.TSTypeReference = js.native
}
object TSTypeReference {
  
  @JSImport("babel-types/ts3.6", "TSTypeReference")
  @js.native
  def apply(typeName: TSEntityName): TSTypeReference = js.native
  @JSImport("babel-types/ts3.6", "TSTypeReference")
  @js.native
  def apply(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
  
  @scala.inline
  implicit class TSTypeReferenceMutableBuilder[Self <: TSTypeReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TSEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
