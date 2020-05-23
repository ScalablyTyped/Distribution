package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXIdentifier_
  extends JSX
     with BaseNode {
  var name: String
  @JSName("type")
  var type_JSXIdentifier_ : JSXIdentifier
}

object JSXIdentifier_ {
  @scala.inline
  def apply(
    name: String,
    `type`: JSXIdentifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier_]
  }
}

