package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends Node
     with TSEntityName {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: typings.babelDashTypes.babelDashTypesStrings.TSQualifiedName
}

@JSImport("babel-types", "TSQualifiedName")
@js.native
object TSQualifiedName extends js.Object {
  def apply(left: TSEntityName, right: Identifier): TSQualifiedName = js.native
}

