package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXNamespacedName
  extends Node
     with JSX {
  var name: JSXIdentifier
  var namespace: JSXIdentifier
  @JSName("type")
  var type_JSXNamespacedName: babelDashTypesLib.babelDashTypesLibStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: JSXIdentifier,
    namespace: JSXIdentifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXNamespacedName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name, namespace = namespace, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

