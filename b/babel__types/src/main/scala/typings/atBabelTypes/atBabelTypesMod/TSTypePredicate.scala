package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypePredicate
  extends TSType
     with BaseNode {
  var parameterName: Identifier | TSThisType
  var typeAnnotation: TSTypeAnnotation
  @JSName("type")
  var type_TSTypePredicate: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate
}

object TSTypePredicate {
  @scala.inline
  def apply(
    parameterName: Identifier | TSThisType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypePredicate]
  }
}

@JSImport("@babel/types", "tsTypePredicate")
@js.native
object tsTypePredicate extends js.Object {
  def apply(parameterName: Identifier, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
}

