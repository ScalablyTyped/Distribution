package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait FunctionTypeParam_
  extends Flow
     with BaseNode {
  var name: Identifier_ | Null
  var optional: Boolean | Null
  var typeAnnotation: FlowType
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam
}

object FunctionTypeParam_ {
  @scala.inline
  def apply(
    `type`: FunctionTypeParam,
    typeAnnotation: FlowType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    name: Identifier_ = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam_]
  }
}

