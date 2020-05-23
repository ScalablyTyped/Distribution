package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAnnotation_
  extends BaseNode
     with _Node {
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeAnnotation_ : TSTypeAnnotation
}

object TSTypeAnnotation_ {
  @scala.inline
  def apply(
    `type`: TSTypeAnnotation,
    typeAnnotation: TSType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAnnotation_]
  }
}

