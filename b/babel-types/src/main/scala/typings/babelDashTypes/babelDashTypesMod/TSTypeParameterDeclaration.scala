package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration extends Node {
  var params: js.Array[TSTypeParameter]
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSTypeParameterDeclaration
}

@JSImport("babel-types", "TSTypeParameterDeclaration")
@js.native
object TSTypeParameterDeclaration extends js.Object {
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
}

