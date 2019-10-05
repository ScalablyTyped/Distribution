package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeReference
  extends Node
     with TSType {
  var typeName: TSEntityName
  var typeParameters: TypeParameterInstantiation | Null
  @JSName("type")
  var type_TSTypeReference: typings.babelDashTypes.babelDashTypesStrings.TSTypeReference
}

@JSImport("babel-types", "TSTypeReference")
@js.native
object TSTypeReference extends js.Object {
  def apply(typeName: TSEntityName): TSTypeReference = js.native
  def apply(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
}

