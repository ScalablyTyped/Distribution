package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "exportNamedDeclaration")
@js.native
object exportNamedDeclaration extends js.Object {
  def apply(): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.UndefOr[scala.Nothing],
    source: StringLiteral_
  ): ExportNamedDeclaration_ = js.native
  def apply(declaration: js.UndefOr[scala.Nothing], specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier_],
    source: StringLiteral_
  ): ExportNamedDeclaration_ = js.native
  def apply(declaration: Declaration): ExportNamedDeclaration_ = js.native
  def apply(declaration: Declaration, specifiers: js.UndefOr[scala.Nothing], source: StringLiteral_): ExportNamedDeclaration_ = js.native
  def apply(declaration: Declaration, specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
  def apply(declaration: Declaration, specifiers: js.Array[ExportSpecifier_], source: StringLiteral_): ExportNamedDeclaration_ = js.native
}

