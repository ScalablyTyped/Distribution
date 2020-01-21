package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam_
  extends Node
     with Flow {
  var name: Identifier_
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam
}

object FunctionTypeParam_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    `type`: FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam_]
  }
}

