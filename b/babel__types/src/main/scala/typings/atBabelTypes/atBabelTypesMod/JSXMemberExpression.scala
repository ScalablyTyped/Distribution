package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXMemberExpression
  extends JSX
     with BaseNode {
  var `object`: JSXMemberExpression | JSXIdentifier
  var property: JSXIdentifier
  @JSName("type")
  var type_JSXMemberExpression: typings.atBabelTypes.atBabelTypesStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    `object`: JSXMemberExpression | JSXIdentifier,
    property: JSXIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXMemberExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

@JSImport("@babel/types", "jsxMemberExpression")
@js.native
object jsxMemberExpression extends js.Object {
  def apply(`object`: JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpression, property: JSXIdentifier): JSXMemberExpression = js.native
}

