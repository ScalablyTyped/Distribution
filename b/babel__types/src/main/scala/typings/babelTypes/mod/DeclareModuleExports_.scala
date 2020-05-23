package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareModuleExports_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var typeAnnotation: TypeAnnotation_
  @JSName("type")
  var type_DeclareModuleExports_ : DeclareModuleExports
}

object DeclareModuleExports_ {
  @scala.inline
  def apply(
    `type`: DeclareModuleExports,
    typeAnnotation: TypeAnnotation_,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModuleExports_]
  }
}

