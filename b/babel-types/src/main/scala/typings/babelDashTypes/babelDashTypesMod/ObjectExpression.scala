package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression
  extends Node
     with Expression {
  var properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty]
  @JSName("type")
  var type_ObjectExpression: typings.babelDashTypes.babelDashTypesStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression]
  }
}

@JSImport("babel-types", "objectExpression")
@js.native
object objectExpression extends js.Object {
  def apply(): ObjectExpression = js.native
  def apply(properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty]): ObjectExpression = js.native
}

