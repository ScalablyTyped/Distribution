package typings
package babelDashTypesLib.babelDashTypesMod

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
  var type_ImportDeclaration: babelDashTypesLib.babelDashTypesLibStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    source: StringLiteral,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ImportDeclaration,
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

