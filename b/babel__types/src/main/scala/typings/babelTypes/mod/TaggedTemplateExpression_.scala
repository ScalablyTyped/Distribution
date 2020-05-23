package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TaggedTemplateExpression_
  extends Expression
     with BaseNode {
  var quasi: TemplateLiteral_
  var tag: Expression
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression
}

object TaggedTemplateExpression_ {
  @scala.inline
  def apply(
    quasi: TemplateLiteral_,
    tag: Expression,
    `type`: TaggedTemplateExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ = null
  ): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
}

