package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXOpeningElement
  extends Immutable
     with BaseNode
     with JSX {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  var name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName
  var selfClosing: Boolean
  var typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_JSXOpeningElement: typings.atBabelTypes.atBabelTypesStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXOpeningElement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name.asInstanceOf[js.Any], selfClosing = selfClosing)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

