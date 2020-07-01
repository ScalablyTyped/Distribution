package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait OptionalMemberExpression_
  extends Expression
     with BaseNode {
  var computed: Boolean
  var `object`: Expression
  var optional: Boolean
  var property: Expression | Identifier_
  @JSName("type")
  var type_OptionalMemberExpression_ : OptionalMemberExpression
}

object OptionalMemberExpression_ {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression,
    optional: Boolean,
    property: Expression | Identifier_,
    `type`: OptionalMemberExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalMemberExpression_]
  }
}

