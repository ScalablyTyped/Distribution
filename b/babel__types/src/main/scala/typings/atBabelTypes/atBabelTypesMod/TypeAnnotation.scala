package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TypeAnnotation
  extends Flow
     with BaseNode {
  var typeAnnotation: FlowType
  @JSName("type")
  var type_TypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.TypeAnnotation
}

object TypeAnnotation {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TypeAnnotation,
    typeAnnotation: FlowType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeAnnotation]
  }
}

@JSImport("@babel/types", "typeAnnotation")
@js.native
object typeAnnotation extends js.Object {
  def apply(typeAnnotation: FlowType): TypeAnnotation = js.native
}

