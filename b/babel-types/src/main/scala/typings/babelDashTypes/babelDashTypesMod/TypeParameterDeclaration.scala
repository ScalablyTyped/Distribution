package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameterDeclaration
  extends Node
     with Flow {
  var params: js.Array[Identifier]
  @JSName("type")
  var type_TypeParameterDeclaration: typings.babelDashTypes.babelDashTypesStrings.TypeParameterDeclaration
}

object TypeParameterDeclaration {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[Identifier],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration]
  }
}

@JSImport("babel-types", "typeParameterDeclaration")
@js.native
object typeParameterDeclaration extends js.Object {
  def apply(): TypeParameterDeclaration = js.native
  def apply(params: js.Array[Identifier]): TypeParameterDeclaration = js.native
}

