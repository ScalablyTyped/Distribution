package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareExportDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var declaration: Flow | Null
  var default: Boolean | Null
  var source: StringLiteral_ | Null
  var specifiers: (js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]) | Null
  @JSName("type")
  var type_DeclareExportDeclaration_ : DeclareExportDeclaration
}

object DeclareExportDeclaration_ {
  @scala.inline
  def apply(
    `type`: DeclareExportDeclaration,
    declaration: Flow = null,
    default: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    source: StringLiteral_ = null,
    specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_] = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportDeclaration_]
  }
}

