package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration
  extends Node
     with Class
     with Declaration
     with Pureish
     with Scopable
     with Statement {
  var body: ClassBody
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var id: Identifier
  var implements: js.UndefOr[js.Array[ClassImplements]] = js.undefined
  var mixins: js.UndefOr[js.Array[_]] = js.undefined
  var superClass: Expression
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassDeclaration: typings.babelDashTypes.babelDashTypesStrings.ClassDeclaration
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBody,
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    superClass: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassDeclaration,
    decorators: js.Array[Decorator] = null,
    implements: js.Array[ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    mixins: js.Array[_] = null,
    superTypeParameters: TypeParameterInstantiation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body, end = end, id = id, loc = loc, start = start, superClass = superClass)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

@JSImport("babel-types", "classDeclaration")
@js.native
object classDeclaration extends js.Object {
  def apply(): ClassDeclaration = js.native
  def apply(id: Identifier): ClassDeclaration = js.native
  def apply(id: Identifier, superClass: Expression): ClassDeclaration = js.native
  def apply(id: Identifier, superClass: Expression, body: ClassBody): ClassDeclaration = js.native
  def apply(id: Identifier, superClass: Expression, body: ClassBody, decorators: js.Array[Decorator]): ClassDeclaration = js.native
}

