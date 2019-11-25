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

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ClassPrivateMethod
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
  var body: BlockStatement
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var generator: Boolean
  var key: PrivateName
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: js.Any | Null
  var static: Boolean
  var typeParameters: js.Any | Null
  @JSName("type")
  var type_ClassPrivateMethod: typings.atBabelTypes.atBabelTypesStrings.ClassPrivateMethod
}

object ClassPrivateMethod {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName,
    kind: get | set | method | constructor,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    static: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassPrivateMethod,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    returnType: js.Any = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: js.Any = null
  ): ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateMethod]
  }
}

@JSImport("@babel/types", "classPrivateMethod")
@js.native
object classPrivateMethod extends js.Object {
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: PrivateName,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    _static: js.UndefOr[Boolean],
    `abstract`: js.UndefOr[Boolean | Null],
    access: js.UndefOr[public | `private` | `protected` | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    async: js.UndefOr[Boolean],
    computed: js.UndefOr[Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    generator: js.UndefOr[Boolean],
    optional: js.UndefOr[Boolean | Null],
    returnType: js.UndefOr[js.Any | Null],
    typeParameters: js.UndefOr[js.Any | Null]
  ): ClassPrivateMethod = js.native
}

