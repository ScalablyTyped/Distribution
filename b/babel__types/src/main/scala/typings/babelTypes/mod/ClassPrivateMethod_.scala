package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassPrivateMethod
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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ClassPrivateMethod_
  extends BlockParent
     with BaseNode
     with Function
     with FunctionParent
     with Method
     with Private
     with Scopable {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var body: BlockStatement_
  var computed: Boolean
  var decorators: js.Array[Decorator_] | Null
  var generator: Boolean
  var key: PrivateName_
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  var returnType: js.Any
  var static: Boolean
  var typeParameters: js.Any
  @JSName("type")
  var type_ClassPrivateMethod_ : ClassPrivateMethod
}

object ClassPrivateMethod_ {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName_,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    returnType: js.Any,
    static: Boolean,
    `type`: ClassPrivateMethod,
    typeParameters: js.Any,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any], access = access.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateMethod_]
  }
}

