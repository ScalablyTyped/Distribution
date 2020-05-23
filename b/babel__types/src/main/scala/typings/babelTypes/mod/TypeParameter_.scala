package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeParameter_
  extends Flow
     with BaseNode {
  var bound: TypeAnnotation_ | Null
  var default: FlowType | Null
  var name: String
  @JSName("type")
  var type_TypeParameter_ : TypeParameter
  var variance: Variance_ | Null
}

object TypeParameter_ {
  @scala.inline
  def apply(
    name: String,
    `type`: TypeParameter,
    bound: TypeAnnotation_ = null,
    default: FlowType = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    variance: Variance_ = null
  ): TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter_]
  }
}

