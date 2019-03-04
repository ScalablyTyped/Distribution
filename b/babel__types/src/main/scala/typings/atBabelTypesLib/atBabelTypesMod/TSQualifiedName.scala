package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSQualifiedName
  extends TSEntityName
     with BaseNode {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: atBabelTypesLib.atBabelTypesLibStrings.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    left: TSEntityName,
    right: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSQualifiedName,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSQualifiedName]
  }
}

