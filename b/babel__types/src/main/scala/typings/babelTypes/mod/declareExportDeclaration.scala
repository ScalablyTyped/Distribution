package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "declareExportDeclaration")
@js.native
object declareExportDeclaration extends js.Object {
  
  def apply(): DeclareExportDeclaration_ = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.UndefOr[scala.Nothing],
    source: StringLiteral_
  ): DeclareExportDeclaration_ = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]
  ): DeclareExportDeclaration_ = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
    source: StringLiteral_
  ): DeclareExportDeclaration_ = js.native
  def apply(declaration: js.UndefOr[scala.Nothing], specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = js.native
  def apply(declaration: Null, specifiers: js.UndefOr[scala.Nothing], source: StringLiteral_): DeclareExportDeclaration_ = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): DeclareExportDeclaration_ = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
    source: StringLiteral_
  ): DeclareExportDeclaration_ = js.native
  def apply(declaration: Null, specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = js.native
  def apply(declaration: Flow): DeclareExportDeclaration_ = js.native
  def apply(declaration: Flow, specifiers: js.UndefOr[scala.Nothing], source: StringLiteral_): DeclareExportDeclaration_ = js.native
  def apply(declaration: Flow, specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): DeclareExportDeclaration_ = js.native
  def apply(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
    source: StringLiteral_
  ): DeclareExportDeclaration_ = js.native
  def apply(declaration: Flow, specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = js.native
}
