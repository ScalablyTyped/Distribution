package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeQuery_
  extends TSType
     with BaseNode {
  var exprName: TSEntityName | TSImportType_
  @JSName("type")
  var type_TSTypeQuery_ : TSTypeQuery
}

object TSTypeQuery_ {
  @scala.inline
  def apply(
    exprName: TSEntityName | TSImportType_,
    `type`: TSTypeQuery,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeQuery_]
  }
}

