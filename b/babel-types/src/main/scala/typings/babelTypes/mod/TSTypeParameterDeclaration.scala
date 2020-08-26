package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterDeclaration extends Node {
  var params: js.Array[TSTypeParameter] = js.native
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration = js.native
}

@JSImport("babel-types", "TSTypeParameterDeclaration")
@js.native
object TSTypeParameterDeclaration extends js.Object {
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
}

