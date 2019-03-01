package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportEqualsDeclaration
  extends Node
     with Statement {
  var id: Identifier
  var isExport: scala.Boolean | scala.Null
  var moduleReference: TSEntityName | TSExternalModuleReference
  @JSName("type")
  var type_TSImportEqualsDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    moduleReference: TSEntityName | TSExternalModuleReference,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSImportEqualsDeclaration,
    innerComments: js.Array[Comment] = null,
    isExport: js.UndefOr[scala.Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("moduleReference")(moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

