package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ClassExpression
  extends Class
     with BaseNode
     with Expression
     with Pureish
     with Scopable {
  var body: ClassBody
  var decorators: js.Array[Decorator] | Null
  var id: Identifier | Null
  var implements: (js.Array[TSExpressionWithTypeArguments | ClassImplements]) | Null
  var mixins: js.Any | Null
  var superClass: Expression | Null
  var superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_ClassExpression: typings.atBabelTypes.atBabelTypesStrings.ClassExpression
}

object ClassExpression {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassExpression,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    id: Identifier = null,
    implements: js.Array[TSExpressionWithTypeArguments | ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: js.Any = null,
    start: Int | Double = null,
    superClass: Expression = null,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
}

@JSImport("@babel/types", "classExpression")
@js.native
object classExpression extends js.Object {
  def apply(id: js.UndefOr[Identifier | Null], superClass: js.UndefOr[Expression | Null], body: ClassBody): ClassExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator]
  ): ClassExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements]
  ): ClassExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any
  ): ClassExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation
  ): ClassExpression = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): ClassExpression = js.native
}

