package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXNamespacedName_
  extends JSX
     with BaseNode {
  var name: JSXIdentifier_
  var namespace: JSXIdentifier_
  @JSName("type")
  var type_JSXNamespacedName_ : JSXNamespacedName
}

object JSXNamespacedName_ {
  @scala.inline
  def apply(
    name: JSXIdentifier_,
    namespace: JSXIdentifier_,
    `type`: JSXNamespacedName,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName_]
  }
}

