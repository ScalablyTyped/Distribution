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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier]
  }
}

@JSImport("babel-types", "jSXIdentifier")
@js.native
object jSXIdentifier extends js.Object {
  def apply(): JSXIdentifier = js.native
  def apply(name: String): JSXIdentifier = js.native
}

