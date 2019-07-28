package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.constructor
import typings.babelDashTypes.babelDashTypesStrings.get
import typings.babelDashTypes.babelDashTypesStrings.method
import typings.babelDashTypes.babelDashTypesStrings.set
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
  var async: Boolean
  var body: BlockStatement
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var expression: Boolean
  var generator: Boolean
  var id: Identifier
  var key: Expression
  var kind: constructor | method | get | set
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var static: Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassMethod: typings.babelDashTypes.babelDashTypesStrings.ClassMethod
  var value: js.UndefOr[FunctionExpression] = js.undefined
}

object ClassMethod {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement,
    computed: Boolean,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier,
    key: Expression,
    kind: constructor | method | get | set,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    static: Boolean,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassMethod,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null,
    value: FunctionExpression = null
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(async = async, body = body, computed = computed, end = end, expression = expression, generator = generator, id = id, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, params = params, start = start, static = static)
    __obj.updateDynamic("type")(`type`)
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

