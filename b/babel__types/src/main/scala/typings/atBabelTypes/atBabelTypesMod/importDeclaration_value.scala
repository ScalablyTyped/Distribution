package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "importDeclaration")
@js.native
object importDeclaration_value extends js.Object {
  def apply(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: value
  ): ImportDeclaration = js.native
}

