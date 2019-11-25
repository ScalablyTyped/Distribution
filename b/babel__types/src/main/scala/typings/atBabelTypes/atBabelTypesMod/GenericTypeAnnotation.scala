package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait GenericTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var id: Identifier | QualifiedTypeIdentifier
  var typeParameters: TypeParameterInstantiation | Null
  @JSName("type")
  var type_GenericTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.GenericTypeAnnotation
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    id: Identifier | QualifiedTypeIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.GenericTypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

@JSImport("@babel/types", "genericTypeAnnotation")
@js.native
object genericTypeAnnotation extends js.Object {
  def apply(id: Identifier): GenericTypeAnnotation = js.native
  def apply(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifier): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
}

