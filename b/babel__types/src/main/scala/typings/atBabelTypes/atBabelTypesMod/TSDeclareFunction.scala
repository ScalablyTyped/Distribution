package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSDeclareFunction
  extends Declaration
     with BaseNode
     with Statement {
  var async: Boolean
  var declare: Boolean | Null
  var generator: Boolean
  var id: Identifier | Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TSTypeAnnotation | Noop | Null
  var typeParameters: TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareFunction: typings.atBabelTypes.atBabelTypesStrings.TSDeclareFunction
}

object TSDeclareFunction {
  @scala.inline
  def apply(
    async: Boolean,
    generator: Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSDeclareFunction,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TSTypeAnnotation | Noop = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration | Noop = null
  ): TSDeclareFunction = {
    val __obj = js.Dynamic.literal(async = async, generator = generator, params = params)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareFunction]
  }
}

@JSImport("@babel/types", "tsDeclareFunction")
@js.native
object tsDeclareFunction extends js.Object {
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean,
    declare: Boolean
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean,
    declare: Boolean,
    generator: Boolean
  ): TSDeclareFunction = js.native
}

