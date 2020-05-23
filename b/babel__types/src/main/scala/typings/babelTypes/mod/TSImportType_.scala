package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSImportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSImportType_
  extends TSType
     with BaseNode {
  var argument: StringLiteral_
  var qualifier: TSEntityName | Null
  var typeParameters: TSTypeParameterInstantiation_ | Null
  @JSName("type")
  var type_TSImportType_ : TSImportType
}

object TSImportType_ {
  @scala.inline
  def apply(
    argument: StringLiteral_,
    `type`: TSImportType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    qualifier: TSEntityName = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterInstantiation_ = null
  ): TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportType_]
  }
}

