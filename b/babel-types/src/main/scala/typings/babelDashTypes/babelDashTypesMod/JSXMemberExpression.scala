package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXMemberExpression
  extends Node
     with Expression
     with JSX {
  var `object`: JSXMemberExpression | JSXIdentifier
  var property: JSXIdentifier
  @JSName("type")
  var type_JSXMemberExpression: typings.babelDashTypes.babelDashTypesStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression | JSXIdentifier,
    property: JSXIdentifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXMemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

@JSImport("babel-types", "jSXMemberExpression")
@js.native
object jSXMemberExpression extends js.Object {
  def apply(): JSXMemberExpression = js.native
  def apply(`object`: JSXIdentifier): JSXMemberExpression = js.native
  def apply(`object`: JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpression): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpression, property: JSXIdentifier): JSXMemberExpression = js.native
}

