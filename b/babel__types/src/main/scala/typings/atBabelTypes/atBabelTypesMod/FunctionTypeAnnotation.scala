package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait FunctionTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam | Null
  var returnType: FlowType
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_FunctionTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.FunctionTypeAnnotation
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParam],
    returnType: FlowType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.FunctionTypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    rest: FunctionTypeParam = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params, returnType = returnType)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionTypeAnnotation]
  }
}

