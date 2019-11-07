package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypePredicate
  extends TSType
     with BaseNode {
  var asserts: Boolean
  var parameterName: Identifier | TSThisType
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSTypePredicate: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate
}

object TSTypePredicate {
  @scala.inline
  def apply(
    asserts: Boolean,
    parameterName: Identifier | TSThisType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts, parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSTypePredicate]
  }
}

@JSImport("@babel/types", "tsTypePredicate")
@js.native
object tsTypePredicate extends js.Object {
  def apply(parameterName: Identifier, typeAnnotation: js.UndefOr[scala.Nothing], asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: Identifier, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: Identifier, typeAnnotation: TSTypeAnnotation, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: js.UndefOr[scala.Nothing], asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation, asserts: Boolean): TSTypePredicate = js.native
}

