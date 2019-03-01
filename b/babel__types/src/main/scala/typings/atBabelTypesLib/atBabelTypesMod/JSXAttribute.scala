package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXAttribute
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: atBabelTypesLib.atBabelTypesLibStrings.JSXAttribute
  var value: JSXElement | JSXFragment | StringLiteral | JSXExpressionContainer | scala.Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.JSXAttribute,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement | JSXFragment | StringLiteral | JSXExpressionContainer = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

