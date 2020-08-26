package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclaration_
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration = js.native
  var source: StringLiteral_ | Null = js.native
  var specifiers: js.Array[ExportSpecifier_] = js.native
  @JSName("type")
  var type_ExportNamedDeclaration_ : ExportNamedDeclaration = js.native
}

object ExportNamedDeclaration_ {
  @scala.inline
  def apply(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double,
    `type`: ExportNamedDeclaration
  ): ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration_]
  }
  @scala.inline
  implicit class ExportNamedDeclaration_Ops[Self <: ExportNamedDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclaration(value: Declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecifiersVarargs(value: ExportSpecifier_ *): Self = this.set("specifiers", js.Array(value :_*))
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier_]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExportNamedDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}

