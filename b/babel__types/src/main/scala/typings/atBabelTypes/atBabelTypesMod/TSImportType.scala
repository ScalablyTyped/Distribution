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
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportType]
  }
}

@JSImport("@babel/types", "tsImportType")
@js.native
object tsImportType extends js.Object {
  def apply(argument: StringLiteral): TSImportType = js.native
  def apply(argument: StringLiteral, qualifier: Null, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
  def apply(argument: StringLiteral, qualifier: TSEntityName): TSImportType = js.native
  def apply(argument: StringLiteral, qualifier: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
}

