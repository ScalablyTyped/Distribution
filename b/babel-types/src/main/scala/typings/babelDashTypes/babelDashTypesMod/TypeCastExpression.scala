package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeCastExpression
  extends Node
     with Expression
     with ExpressionWrapper
     with Flow {
  var expression: Expression
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_TypeCastExpression: typings.babelDashTypes.babelDashTypesStrings.TypeCastExpression
}

object TypeCastExpression {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeCastExpression,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression]
  }
}

@JSImport("babel-types", "typeCastExpression")
@js.native
object typeCastExpression extends js.Object {
  def apply(): TypeCastExpression = js.native
  def apply(expression: Expression): TypeCastExpression = js.native
  def apply(expression: Expression, typeAnnotation: FlowTypeAnnotation): TypeCastExpression = js.native
}

