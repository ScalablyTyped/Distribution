package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXNamespacedName
  extends JSX
     with BaseNode {
  var name: JSXIdentifier
  var namespace: JSXIdentifier
  @JSName("type")
  var type_JSXNamespacedName: atBabelTypesLib.atBabelTypesLibStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    name: JSXIdentifier,
    namespace: JSXIdentifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.JSXNamespacedName,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

