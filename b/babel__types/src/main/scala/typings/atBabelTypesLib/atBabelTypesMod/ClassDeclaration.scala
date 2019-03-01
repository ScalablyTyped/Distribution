package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ClassDeclaration
  extends Class
     with BaseNode
     with Declaration
     with Pureish
     with Scopable
     with Statement {
  var `abstract`: scala.Boolean | scala.Null
  var body: ClassBody
  var declare: scala.Boolean | scala.Null
  var decorators: js.Array[Decorator] | scala.Null
  var id: Identifier | scala.Null
  var implements: (js.Array[TSExpressionWithTypeArguments | ClassImplements]) | scala.Null
  var mixins: js.Any | scala.Null
  var superClass: Expression | scala.Null
  var superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ClassDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ClassDeclaration
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ClassDeclaration,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    id: Identifier = null,
    implements: js.Array[TSExpressionWithTypeArguments | ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: js.Any = null,
    start: scala.Int | scala.Double = null,
    superClass: Expression = null,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDeclaration]
  }
}

