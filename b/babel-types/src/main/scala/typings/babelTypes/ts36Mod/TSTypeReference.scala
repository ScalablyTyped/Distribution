package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSTypeReference")
@js.native
object TSTypeReference extends js.Object {
  
  def apply(typeName: TSEntityName): TSTypeReference = js.native
  def apply(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
}
