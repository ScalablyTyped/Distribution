package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait FunctionExpression
  extends BlockParent
     with BaseNode
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: Boolean
  var body: BlockStatement
  var generator: Boolean
  var id: Identifier | Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_FunctionExpression: typings.atBabelTypes.atBabelTypesStrings.FunctionExpression
}

object FunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement,
    generator: Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: typings.atBabelTypes.atBabelTypesStrings.FunctionExpression,
    end: Int | Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body, generator = generator, params = params)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExpression]
  }
}

@JSImport("@babel/types", "functionExpression")
@js.native
object functionExpression extends js.Object {
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionExpression = js.native
}

