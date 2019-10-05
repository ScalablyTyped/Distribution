package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`private`
import typings.atBabelTypes.atBabelTypesStrings.`protected`
import typings.atBabelTypes.atBabelTypesStrings.constructor
import typings.atBabelTypes.atBabelTypesStrings.get
import typings.atBabelTypes.atBabelTypesStrings.method
import typings.atBabelTypes.atBabelTypesStrings.public
import typings.atBabelTypes.atBabelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod
  extends BaseNode
     with _Node {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var generator: Boolean
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TSTypeAnnotation | Noop | Null
  var static: Boolean
  var typeParameters: TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareMethod: typings.atBabelTypes.atBabelTypesStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    static: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSDeclareMethod,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    returnType: TSTypeAnnotation | Noop = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration | Noop = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(async = async, computed = computed, generator = generator, key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params, static = static)
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
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

@JSImport("@babel/types", "tsDeclareMethod")
@js.native
object tsDeclareMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: js.UndefOr[TSTypeAnnotation | Noop | Null],
    `abstract`: js.UndefOr[Boolean | Null],
    access: js.UndefOr[public | `private` | `protected` | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    async: js.UndefOr[Boolean],
    computed: js.UndefOr[Boolean],
    generator: js.UndefOr[Boolean],
    kind: js.UndefOr[get | set | method | constructor],
    optional: js.UndefOr[Boolean | Null],
    _static: js.UndefOr[Boolean]
  ): TSDeclareMethod = js.native
}

