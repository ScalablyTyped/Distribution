package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ArrowFunctionExpression
  extends BlockParent
     with BaseNode
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: Boolean
  var body: BlockStatement | Expression
  var expression: Boolean | Null
  var generator: Boolean
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_ArrowFunctionExpression: typings.atBabelTypes.atBabelTypesStrings.ArrowFunctionExpression
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ArrowFunctionExpression,
    end: Int | Double = null,
    expression: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

@JSImport("@babel/types", "arrowFunctionExpression")
@js.native
object arrowFunctionExpression extends js.Object {
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression
  ): ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean
  ): ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean
  ): ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean
  ): ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): ArrowFunctionExpression = js.native
}

