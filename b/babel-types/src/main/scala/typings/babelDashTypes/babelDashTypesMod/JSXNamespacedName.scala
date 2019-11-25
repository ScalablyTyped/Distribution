package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXNamespacedName
  extends Node
     with JSX {
  var name: JSXIdentifier
  var namespace: JSXIdentifier
  @JSName("type")
  var type_JSXNamespacedName: typings.babelDashTypes.babelDashTypesStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier,
    namespace: JSXIdentifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXNamespacedName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

@JSImport("babel-types", "jSXNamespacedName")
@js.native
object jSXNamespacedName extends js.Object {
  def apply(): JSXNamespacedName = js.native
  def apply(namespace: JSXIdentifier): JSXNamespacedName = js.native
  def apply(namespace: JSXIdentifier, name: JSXIdentifier): JSXNamespacedName = js.native
}

