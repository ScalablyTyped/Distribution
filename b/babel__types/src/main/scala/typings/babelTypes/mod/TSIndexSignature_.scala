package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSIndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSIndexSignature_
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier_]
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation_ | Null
  @JSName("type")
  var type_TSIndexSignature_ : TSIndexSignature
}

object TSIndexSignature_ {
  @scala.inline
  def apply(
    parameters: js.Array[Identifier_],
    `type`: TSIndexSignature,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null
  ): TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexSignature_]
  }
}

