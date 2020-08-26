package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclaration_
  extends Node
     with Declaration
     with ModuleDeclaration
     with Statement {
  var source: StringLiteral_ = js.native
  var specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_] = js.native
  @JSName("type")
  var type_ImportDeclaration_ : ImportDeclaration = js.native
}

object ImportDeclaration_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double,
    `type`: ImportDeclaration
  ): ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration_]
  }
  @scala.inline
  implicit class ImportDeclaration_Ops[Self <: ImportDeclaration_] (val x: Self) extends AnyVal {
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
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = this.set("specifiers", js.Array(value :_*))
    @scala.inline
    def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImportDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

