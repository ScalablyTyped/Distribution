package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSDeclareMethod
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.public
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod_
  extends BaseNode
     with _Node {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[Decorator_] | Null
  var generator: Boolean
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  var returnType: TSTypeAnnotation_ | Noop_ | Null
  var static: Boolean
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null
  @JSName("type")
  var type_TSDeclareMethod_ : TSDeclareMethod
}

object TSDeclareMethod_ {
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean,
    `type`: TSDeclareMethod,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    returnType: TSTypeAnnotation_ | Noop_ = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration_ | Noop_ = null
  ): TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = access.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod_]
  }
}

