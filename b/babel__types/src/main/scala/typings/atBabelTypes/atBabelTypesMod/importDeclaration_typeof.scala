package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.typeof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "importDeclaration")
@js.native
object importDeclaration_typeof extends js.Object {
  def apply(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: typeof
  ): ImportDeclaration = js.native
}

