package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`private`
import typings.babelDashTypes.babelDashTypesStrings.`protected`
import typings.babelDashTypes.babelDashTypesStrings.constructor
import typings.babelDashTypes.babelDashTypesStrings.get
import typings.babelDashTypes.babelDashTypesStrings.method
import typings.babelDashTypes.babelDashTypesStrings.public
import typings.babelDashTypes.babelDashTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod extends Node {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var generator: Boolean
  var key: Expression
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var static: Boolean | Null
  var typeParameters: TypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareMethod: typings.babelDashTypes.babelDashTypesStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    end: Double,
    generator: Boolean,
    key: Expression,
    kind: get | set | method | constructor,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSDeclareMethod,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    static: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | Noop = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(async = async, computed = computed, end = end, generator = generator, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

