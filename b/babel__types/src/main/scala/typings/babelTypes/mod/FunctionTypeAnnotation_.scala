package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait FunctionTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var params: js.Array[FunctionTypeParam_]
  var rest: FunctionTypeParam_ | Null
  var returnType: FlowType
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_FunctionTypeAnnotation_ : FunctionTypeAnnotation
}

object FunctionTypeAnnotation_ {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParam_],
    returnType: FlowType,
    `type`: FunctionTypeAnnotation,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    rest: FunctionTypeParam_ = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeAnnotation_]
  }
}

