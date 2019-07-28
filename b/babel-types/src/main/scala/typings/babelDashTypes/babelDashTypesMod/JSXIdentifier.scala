package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXIdentifier
  extends Node
     with Expression
     with JSX {
  var name: String
  @JSName("type")
  var type_JSXIdentifier: typings.babelDashTypes.babelDashTypesStrings.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: String,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXIdentifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXIdentifier = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXIdentifier]
  }
}

