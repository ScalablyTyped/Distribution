package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod
  extends BaseNode
     with _Node {
  var `abstract`: scala.Boolean | scala.Null
  var access: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var async: scala.Boolean
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var kind: atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TSTypeAnnotation | Noop | scala.Null
  var static: scala.Boolean | scala.Null
  var typeParameters: TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareMethod: atBabelTypesLib.atBabelTypesLibStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    computed: scala.Boolean,
    generator: scala.Boolean,
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    kind: atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSDeclareMethod,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    returnType: TSTypeAnnotation | Noop = null,
    start: scala.Int | scala.Double = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration | Noop = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(async = async, computed = computed, generator = generator, key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

