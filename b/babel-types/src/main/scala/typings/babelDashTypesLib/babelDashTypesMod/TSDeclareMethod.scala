package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod extends Node {
  var `abstract`: scala.Boolean | scala.Null
  var access: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` | scala.Null
  var accessibility: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` | scala.Null
  var async: scala.Boolean
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var static: scala.Boolean | scala.Null
  var typeParameters: TypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareMethod: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    computed: scala.Boolean,
    end: scala.Double,
    generator: scala.Boolean,
    key: Expression,
    kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.constructor,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareMethod,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` = null,
    accessibility: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` = null,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | Noop = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("start")(start)
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

