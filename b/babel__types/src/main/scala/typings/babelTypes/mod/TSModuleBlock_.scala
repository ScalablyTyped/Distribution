package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSModuleBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSModuleBlock_
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  var body: js.Array[Statement]
  @JSName("type")
  var type_TSModuleBlock_ : TSModuleBlock
}

object TSModuleBlock_ {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: TSModuleBlock,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleBlock_]
  }
}

