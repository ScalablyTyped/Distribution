package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXOpeningElement
  extends Node
     with Immutable
     with JSX {
  var attributes: js.Array[JSXAttribute]
  var name: JSXIdentifier | JSXMemberExpression
  var selfClosing: Boolean
  @JSName("type")
  var type_JSXOpeningElement: typings.babelDashTypes.babelDashTypesStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXMemberExpression,
    selfClosing: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXOpeningElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, end = end, loc = loc, name = name.asInstanceOf[js.Any], selfClosing = selfClosing, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

@JSImport("babel-types", "jSXOpeningElement")
@js.native
object jSXOpeningElement extends js.Object {
  def apply(): JSXOpeningElement = js.native
  def apply(name: JSXIdentifier): JSXOpeningElement = js.native
  def apply(name: JSXIdentifier, attributes: js.Array[JSXAttribute]): JSXOpeningElement = js.native
  def apply(name: JSXIdentifier, attributes: js.Array[JSXAttribute], selfClosing: Boolean): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpression): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpression, attributes: js.Array[JSXAttribute]): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpression, attributes: js.Array[JSXAttribute], selfClosing: Boolean): JSXOpeningElement = js.native
}

