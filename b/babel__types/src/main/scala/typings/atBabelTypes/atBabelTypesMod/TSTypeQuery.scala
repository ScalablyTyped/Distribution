package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypeQuery
  extends TSType
     with BaseNode {
  var exprName: TSEntityName | TSImportType
  @JSName("type")
  var type_TSTypeQuery: typings.atBabelTypes.atBabelTypesStrings.TSTypeQuery
}

object TSTypeQuery {
  @scala.inline
  def apply(
    exprName: TSEntityName | TSImportType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeQuery,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeQuery]
  }
}

@JSImport("@babel/types", "tsTypeQuery")
@js.native
object tsTypeQuery extends js.Object {
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
  def apply(exprName: TSImportType): TSTypeQuery = js.native
}

