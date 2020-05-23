package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSPropertySignature_
  extends TSTypeElement
     with BaseNode {
  var computed: Boolean | Null
  var initializer: Expression | Null
  var key: Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation_ | Null
  @JSName("type")
  var type_TSPropertySignature_ : TSPropertySignature
}

object TSPropertySignature_ {
  @scala.inline
  def apply(
    key: Expression,
    `type`: TSPropertySignature,
    computed: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null
  ): TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature_]
  }
}

