package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression
  extends Node
     with BlockParent
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: Boolean
  var body: BlockStatement | Expression
  var expression: Boolean
  var generator: Boolean
  var id: Identifier
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ArrowFunctionExpression: typings.babelDashTypes.babelDashTypesStrings.ArrowFunctionExpression
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement | Expression,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ArrowFunctionExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body.asInstanceOf[js.Any], end = end, expression = expression, generator = generator, id = id, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

@JSImport("babel-types", "arrowFunctionExpression")
@js.native
object arrowFunctionExpression extends js.Object {
  def apply(): ArrowFunctionExpression = js.native
  def apply(params: js.Array[LVal]): ArrowFunctionExpression = js.native
  def apply(params: js.Array[LVal], body: BlockStatement): ArrowFunctionExpression = js.native
  def apply(params: js.Array[LVal], body: BlockStatement, async: Boolean): ArrowFunctionExpression = js.native
  def apply(params: js.Array[LVal], body: Expression): ArrowFunctionExpression = js.native
  def apply(params: js.Array[LVal], body: Expression, async: Boolean): ArrowFunctionExpression = js.native
}

