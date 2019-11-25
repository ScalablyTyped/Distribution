package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXNamespacedName
  extends JSX
     with BaseNode {
  var name: JSXIdentifier
  var namespace: JSXIdentifier
  @JSName("type")
  var type_JSXNamespacedName: typings.atBabelTypes.atBabelTypesStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    name: JSXIdentifier,
    namespace: JSXIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXNamespacedName,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

@JSImport("@babel/types", "jsxNamespacedName")
@js.native
object jsxNamespacedName extends js.Object {
  def apply(namespace: JSXIdentifier, name: JSXIdentifier): JSXNamespacedName = js.native
}

