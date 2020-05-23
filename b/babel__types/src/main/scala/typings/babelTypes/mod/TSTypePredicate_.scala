package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypePredicate_
  extends TSType
     with BaseNode {
  var asserts: Boolean | Null
  var parameterName: Identifier_ | TSThisType_
  var typeAnnotation: TSTypeAnnotation_ | Null
  @JSName("type")
  var type_TSTypePredicate_ : TSTypePredicate
}

object TSTypePredicate_ {
  @scala.inline
  def apply(
    parameterName: Identifier_ | TSThisType_,
    `type`: TSTypePredicate,
    asserts: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null
  ): TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], asserts = asserts.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate_]
  }
}

