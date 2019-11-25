package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends Node
     with BlockParent
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: Boolean
  var body: BlockStatement
  var generator: Boolean
  var id: Identifier
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_FunctionDeclaration: typings.babelDashTypes.babelDashTypesStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement,
    end: Double,
    generator: Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.FunctionDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

@JSImport("babel-types", "functionDeclaration")
@js.native
object functionDeclaration extends js.Object {
  def apply(): FunctionDeclaration = js.native
  def apply(id: Identifier): FunctionDeclaration = js.native
  def apply(id: Identifier, params: js.Array[LVal]): FunctionDeclaration = js.native
  def apply(id: Identifier, params: js.Array[LVal], body: BlockStatement): FunctionDeclaration = js.native
  def apply(id: Identifier, params: js.Array[LVal], body: BlockStatement, generator: Boolean): FunctionDeclaration = js.native
  def apply(id: Identifier, params: js.Array[LVal], body: BlockStatement, generator: Boolean, async: Boolean): FunctionDeclaration = js.native
}

