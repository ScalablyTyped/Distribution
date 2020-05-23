package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceBody_
  extends BaseNode
     with _Node {
  var body: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSInterfaceBody_ : TSInterfaceBody
}

object TSInterfaceBody_ {
  @scala.inline
  def apply(
    body: js.Array[TSTypeElement],
    `type`: TSInterfaceBody,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSInterfaceBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceBody_]
  }
}

