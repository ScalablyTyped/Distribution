package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier | JSXMemberExpression
  @JSName("type")
  var type_JSXClosingElement: typings.babelDashTypes.babelDashTypesStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXMemberExpression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXClosingElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
}

@JSImport("babel-types", "jSXClosingElement")
@js.native
object jSXClosingElement extends js.Object {
  def apply(): JSXClosingElement = js.native
  def apply(name: JSXIdentifier): JSXClosingElement = js.native
  def apply(name: JSXMemberExpression): JSXClosingElement = js.native
}

