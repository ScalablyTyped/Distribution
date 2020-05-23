package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterInstantiation_
  extends BaseNode
     with _Node {
  var params: js.Array[TSType]
  @JSName("type")
  var type_TSTypeParameterInstantiation_ : TSTypeParameterInstantiation
}

object TSTypeParameterInstantiation_ {
  @scala.inline
  def apply(
    params: js.Array[TSType],
    `type`: TSTypeParameterInstantiation,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterInstantiation_]
  }
}

