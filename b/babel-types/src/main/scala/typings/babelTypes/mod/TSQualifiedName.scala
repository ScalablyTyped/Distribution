package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends Node
     with TSEntityName {
  var left: TSEntityName
  var right: Identifier_
  @JSName("type")
  var type_TSQualifiedName: typings.babelTypes.babelTypesStrings.TSQualifiedName
}

@JSImport("babel-types", "TSQualifiedName")
@js.native
object TSQualifiedName extends js.Object {
  def apply(left: TSEntityName, right: Identifier_): TSQualifiedName = js.native
}

