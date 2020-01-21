package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassMethod
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassMethod_
  extends Node
     with BlockParent
     with Function
     with FunctionParent
     with Method
     with Scopable {
  var async: Boolean
  var body: BlockStatement_
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.undefined
  var expression: Boolean
  var generator: Boolean
  var id: Identifier_
  var key: Expression
  var kind: constructor | method | get | set
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation_] = js.undefined
  var static: Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.undefined
  @JSName("type")
  var type_ClassMethod_ : ClassMethod
  var value: js.UndefOr[FunctionExpression_] = js.undefined
}

object ClassMethod_ {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier_,
    key: Expression,
    kind: constructor | method | get | set,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    static: Boolean,
    `type`: ClassMethod,
    decorators: js.Array[Decorator_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation_ = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ = null,
    value: FunctionExpression_ = null
  ): ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMethod_]
  }
}

