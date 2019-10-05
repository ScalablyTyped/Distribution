package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TypeCastExpression
  extends Expression
     with BaseNode
     with ExpressionWrapper
     with Flow {
  var expression: Expression
  var typeAnnotation: TypeAnnotation
  @JSName("type")
  var type_TypeCastExpression: typings.atBabelTypes.atBabelTypesStrings.TypeCastExpression
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeCastExpression]
  }
}

@JSImport("@babel/types", "typeCastExpression")
@js.native
object typeCastExpression extends js.Object {
  def apply(expression: Expression, typeAnnotation: TypeAnnotation): TypeCastExpression = js.native
}

