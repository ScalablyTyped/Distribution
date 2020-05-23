package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSMethodSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSMethodSignature_
  extends TSTypeElement
     with BaseNode {
  var computed: Boolean | Null
  var key: Expression
  var optional: Boolean | Null
  var parameters: js.Array[Identifier_ | RestElement_]
  var typeAnnotation: TSTypeAnnotation_ | Null
  var typeParameters: TSTypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSMethodSignature_ : TSMethodSignature
}

object TSMethodSignature_ {
  @scala.inline
  def apply(
    key: Expression,
    parameters: js.Array[Identifier_ | RestElement_],
    `type`: TSMethodSignature,
    computed: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMethodSignature_]
  }
}

