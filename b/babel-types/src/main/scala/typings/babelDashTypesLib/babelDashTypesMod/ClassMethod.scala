package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassMethod
  extends Node
     with BlockParent
     with Function
     with FunctionParent
     with Method
     with Scopable {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var expression: scala.Boolean
  var generator: scala.Boolean
  var id: Identifier
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.constructor | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var static: scala.Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassMethod: babelDashTypesLib.babelDashTypesLibStrings.ClassMethod
  var value: js.UndefOr[FunctionExpression] = js.undefined
}

object ClassMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    computed: scala.Boolean,
    end: scala.Double,
    expression: scala.Boolean,
    generator: scala.Boolean,
    id: Identifier,
    key: Expression,
    kind: babelDashTypesLib.babelDashTypesLibStrings.constructor | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: scala.Double,
    static: scala.Boolean,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ClassMethod,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null,
    value: FunctionExpression = null
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("static")(static)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClassMethod]
  }
}

