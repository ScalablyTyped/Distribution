package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration_
  extends BaseNode
     with _Node {
  var params: js.Array[TSTypeParameter_]
  @JSName("type")
  var type_TSTypeParameterDeclaration_ : TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration_ {
  @scala.inline
  def apply(
    params: js.Array[TSTypeParameter_],
    `type`: TSTypeParameterDeclaration,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration_]
  }
}

