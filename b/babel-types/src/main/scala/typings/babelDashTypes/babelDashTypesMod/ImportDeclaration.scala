package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends Node
     with Declaration
     with ModuleDeclaration
     with Statement {
  var source: StringLiteral
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  @JSName("type")
  var type_ImportDeclaration: typings.babelDashTypes.babelDashTypesStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ImportDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, source = source, specifiers = specifiers, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

@JSImport("babel-types", "importDeclaration")
@js.native
object importDeclaration extends js.Object {
  def apply(): ImportDeclaration = js.native
  def apply(specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral
  ): ImportDeclaration = js.native
}

