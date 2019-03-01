package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ImportSpecifier
  extends ModuleSpecifier
     with BaseNode {
  var importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | scala.Null
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ImportSpecifier: atBabelTypesLib.atBabelTypesLibStrings.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(
    imported: Identifier,
    local: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ImportSpecifier,
    end: scala.Int | scala.Double = null,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("imported")(imported)
    __obj.updateDynamic("local")(local)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportSpecifier]
  }
}

