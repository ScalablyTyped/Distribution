package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait GenericTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var id: Identifier_ | QualifiedTypeIdentifier_
  var typeParameters: TypeParameterInstantiation_ | Null
  @JSName("type")
  var type_GenericTypeAnnotation_ : GenericTypeAnnotation
}

object GenericTypeAnnotation_ {
  @scala.inline
  def apply(
    id: Identifier_ | QualifiedTypeIdentifier_,
    `type`: GenericTypeAnnotation,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation_ = null
  ): GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeAnnotation_]
  }
}

