package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXClosingElement_
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement
}

object JSXClosingElement_ {
  @scala.inline
  def apply(
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    `type`: JSXClosingElement,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement_]
  }
}

