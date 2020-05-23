package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareExportAllDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var exportKind: `type` | value | Null
  var source: StringLiteral_
  @JSName("type")
  var type_DeclareExportAllDeclaration_ : DeclareExportAllDeclaration
}

object DeclareExportAllDeclaration_ {
  @scala.inline
  def apply(
    source: StringLiteral_,
    `type`: DeclareExportAllDeclaration,
    end: Double = null.asInstanceOf[Double],
    exportKind: `type` | value = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], exportKind = exportKind.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration_]
  }
}

