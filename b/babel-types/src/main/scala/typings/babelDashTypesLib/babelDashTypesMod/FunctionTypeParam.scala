package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam
  extends Node
     with Flow {
  var name: Identifier
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_FunctionTypeParam: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeParam
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

