package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSNamespaceExportDeclaration
  extends Node
     with Statement {
  var id: Identifier_
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
}

@JSImport("babel-types", "TSNamespaceExportDeclaration")
@js.native
object TSNamespaceExportDeclaration extends js.Object {
  def apply(id: Identifier_): TSNamespaceExportDeclaration = js.native
}

