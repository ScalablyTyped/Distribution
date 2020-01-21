package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "exportNamedDeclaration")
@js.native
object exportNamedDeclaration extends js.Object {
  def apply(): ExportNamedDeclaration_ = js.native
  def apply(declaration: js.Any): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: js.Any,
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]
  ): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: js.Any,
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    source: StringLiteral_
  ): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]
  ): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    source: StringLiteral_
  ): ExportNamedDeclaration_ = js.native
}

