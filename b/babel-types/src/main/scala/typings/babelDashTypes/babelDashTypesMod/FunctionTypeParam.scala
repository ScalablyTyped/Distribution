package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam
  extends Node
     with Flow {
  var name: Identifier
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_FunctionTypeParam: typings.babelDashTypes.babelDashTypesStrings.FunctionTypeParam
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

@JSImport("babel-types", "functionTypeParam")
@js.native
object functionTypeParam extends js.Object {
  def apply(): FunctionTypeParam = js.native
  def apply(name: Identifier): FunctionTypeParam = js.native
  def apply(name: Identifier, typeAnnotation: FlowTypeAnnotation): FunctionTypeParam = js.native
}

