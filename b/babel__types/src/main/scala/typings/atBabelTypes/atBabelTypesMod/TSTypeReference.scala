package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypeReference
  extends TSType
     with BaseNode {
  var typeName: TSEntityName
  var typeParameters: TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_TSTypeReference: typings.atBabelTypes.atBabelTypesStrings.TSTypeReference
}

object TSTypeReference {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeReference,
    typeName: TSEntityName,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeReference]
  }
}

