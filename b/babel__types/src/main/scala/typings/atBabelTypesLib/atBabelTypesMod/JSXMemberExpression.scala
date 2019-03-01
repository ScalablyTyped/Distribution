package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXMemberExpression
  extends JSX
     with BaseNode {
  var `object`: JSXMemberExpression | JSXIdentifier
  var property: JSXIdentifier
  @JSName("type")
  var type_JSXMemberExpression: atBabelTypesLib.atBabelTypesLibStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    `object`: JSXMemberExpression | JSXIdentifier,
    property: JSXIdentifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.JSXMemberExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any], `type` = `type`)
    __obj.updateDynamic("property")(property)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

