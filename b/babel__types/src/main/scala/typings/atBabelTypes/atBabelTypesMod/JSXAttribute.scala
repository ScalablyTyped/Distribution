package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXAttribute
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: typings.atBabelTypes.atBabelTypesStrings.JSXAttribute
  var value: JSXElement | JSXFragment | StringLiteral | JSXExpressionContainer | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXAttribute,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement | JSXFragment | StringLiteral | JSXExpressionContainer = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
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

@JSImport("@babel/types", "jsxAttribute")
@js.native
object jsxAttribute extends js.Object {
  def apply(name: JSXIdentifier): JSXAttribute = js.native
  def apply(name: JSXIdentifier, value: JSXElement): JSXAttribute = js.native
  def apply(name: JSXIdentifier, value: JSXExpressionContainer): JSXAttribute = js.native
  def apply(name: JSXIdentifier, value: JSXFragment): JSXAttribute = js.native
  def apply(name: JSXIdentifier, value: StringLiteral): JSXAttribute = js.native
  def apply(name: JSXNamespacedName): JSXAttribute = js.native
  def apply(name: JSXNamespacedName, value: JSXElement): JSXAttribute = js.native
  def apply(name: JSXNamespacedName, value: JSXExpressionContainer): JSXAttribute = js.native
  def apply(name: JSXNamespacedName, value: JSXFragment): JSXAttribute = js.native
  def apply(name: JSXNamespacedName, value: StringLiteral): JSXAttribute = js.native
}

