package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration
  extends BaseNode
     with _Node {
  var params: js.Array[TSTypeParameter]
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[TSTypeParameter],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameterDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

@JSImport("@babel/types", "tsTypeParameterDeclaration")
@js.native
object tsTypeParameterDeclaration extends js.Object {
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
}

