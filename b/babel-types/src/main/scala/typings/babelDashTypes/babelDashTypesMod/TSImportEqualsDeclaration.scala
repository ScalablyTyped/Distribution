package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportEqualsDeclaration
  extends Node
     with Statement {
  var id: Identifier
  var isExport: Boolean | Null
  var moduleReference: TSEntityName | TSExternalModuleReference
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    moduleReference: TSEntityName | TSExternalModuleReference,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSImportEqualsDeclaration,
    innerComments: js.Array[Comment] = null,
    isExport: js.UndefOr[Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, moduleReference = moduleReference.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

