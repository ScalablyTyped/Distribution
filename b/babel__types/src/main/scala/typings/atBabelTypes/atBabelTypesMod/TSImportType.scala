package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSImportType
  extends TSType
     with BaseNode {
  var argument: StringLiteral
  var qualifier: TSEntityName | Null
  var typeParameters: TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_TSImportType: typings.atBabelTypes.atBabelTypesStrings.TSImportType
}

object TSImportType {
  @scala.inline
  def apply(
    argument: StringLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSImportType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    qualifier: TSEntityName = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSImportType]
  }
}

