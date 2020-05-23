package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParameterProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSParameterProperty_
  extends LVal
     with BaseNode {
  var accessibility: public | `private` | `protected` | Null
  var parameter: Identifier_ | AssignmentPattern_
  var readonly: Boolean | Null
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty
}

object TSParameterProperty_ {
  @scala.inline
  def apply(
    parameter: Identifier_ | AssignmentPattern_,
    `type`: TSParameterProperty,
    accessibility: public | `private` | `protected` = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty_]
  }
}

