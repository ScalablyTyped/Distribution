package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeIndexer_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier_ | Null
  var key: FlowType
  var static: Boolean
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer
  var value: FlowType
  var variance: Variance_ | Null
}

object ObjectTypeIndexer_ {
  @scala.inline
  def apply(
    key: FlowType,
    static: Boolean,
    `type`: ObjectTypeIndexer,
    value: FlowType,
    end: Double = null.asInstanceOf[Double],
    id: Identifier_ = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    variance: Variance_ = null
  ): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
}

