package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ClassMethod
  extends BlockParent
     with BaseNode
     with Function
     with FunctionParent
     with Method
     with Scopable {
  var `abstract`: scala.Boolean | scala.Null
  var access: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var kind: atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var static: scala.Boolean | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ClassMethod: atBabelTypesLib.atBabelTypesLibStrings.ClassMethod
}

object ClassMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    computed: scala.Boolean,
    generator: scala.Boolean,
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    kind: atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ClassMethod,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: scala.Int | scala.Double = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("params")(params)
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
    __obj.asInstanceOf[ClassMethod]
  }
}

