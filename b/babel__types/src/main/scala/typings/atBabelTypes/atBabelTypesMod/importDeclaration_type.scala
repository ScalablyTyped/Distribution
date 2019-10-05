package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "importDeclaration")
@js.native
object importDeclaration_type extends js.Object {
  def apply(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: `type`
  ): ImportDeclaration = js.native
}

