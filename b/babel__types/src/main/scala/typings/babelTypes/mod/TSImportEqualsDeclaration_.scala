package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSImportEqualsDeclaration_
  extends Statement
     with BaseNode {
  var id: Identifier_
  var isExport: Boolean
  var moduleReference: TSEntityName | TSExternalModuleReference_
  @JSName("type")
  var type_TSImportEqualsDeclaration_ : TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration_ {
  @scala.inline
  def apply(
    id: Identifier_,
    isExport: Boolean,
    moduleReference: TSEntityName | TSExternalModuleReference_,
    `type`: TSImportEqualsDeclaration,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportEqualsDeclaration_]
  }
}

