package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectExpression_
  extends Expression
     with BaseNode {
  var properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression
}

object ObjectExpression_ {
  @scala.inline
  def apply(
    properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_],
    `type`: ObjectExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression_]
  }
}

