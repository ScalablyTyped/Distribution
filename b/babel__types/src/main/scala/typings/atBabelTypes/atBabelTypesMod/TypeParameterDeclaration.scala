package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TypeParameterDeclaration
  extends Flow
     with BaseNode {
  var params: js.Array[TypeParameter]
  @JSName("type")
  var type_TypeParameterDeclaration: typings.atBabelTypes.atBabelTypesStrings.TypeParameterDeclaration
}

object TypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[TypeParameter],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TypeParameterDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeParameterDeclaration]
  }
}

@JSImport("@babel/types", "typeParameterDeclaration")
@js.native
object typeParameterDeclaration extends js.Object {
  def apply(params: js.Array[TypeParameter]): TypeParameterDeclaration = js.native
}

