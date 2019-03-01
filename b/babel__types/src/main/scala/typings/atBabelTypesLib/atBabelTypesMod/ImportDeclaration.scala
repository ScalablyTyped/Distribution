package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ImportDeclaration
  extends Declaration
     with BaseNode
     with ModuleDeclaration
     with Statement {
  var importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | atBabelTypesLib.atBabelTypesLibStrings.value | scala.Null
  var source: StringLiteral
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  @JSName("type")
  var type_ImportDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    source: StringLiteral,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ImportDeclaration,
    end: scala.Int | scala.Double = null,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | atBabelTypesLib.atBabelTypesLibStrings.value = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("specifiers")(specifiers)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

