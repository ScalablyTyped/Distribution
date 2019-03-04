package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectMethod
  extends BlockParent
     with BaseNode
     with Function
     with FunctionParent
     with Method
     with ObjectMember
     with Scopable
     with UserWhitespacable {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: js.Any
  var kind: atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ObjectMethod: atBabelTypesLib.atBabelTypesLibStrings.ObjectMethod
}

object ObjectMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    computed: scala.Boolean,
    generator: scala.Boolean,
    key: js.Any,
    kind: atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectMethod,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ObjectMethod = {
    val __obj = js.Dynamic.literal(async = async, body = body, computed = computed, generator = generator, key = key, kind = kind.asInstanceOf[js.Any], params = params)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMethod]
  }
}

