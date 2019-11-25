package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTypePredicate
  extends TSType
     with BaseNode {
  var asserts: Boolean | Null
  var parameterName: Identifier | TSThisType
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSTypePredicate: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate
}

object TSTypePredicate {
  @scala.inline
  def apply(
    parameterName: Identifier | TSThisType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypePredicate,
    asserts: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(asserts)) __obj.updateDynamic("asserts")(asserts.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate]
  }
}

@JSImport("@babel/types", "tsTypePredicate")
@js.native
object tsTypePredicate extends js.Object {
  def apply(parameterName: Identifier): TSTypePredicate = js.native
  def apply(parameterName: Identifier, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: Identifier, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def apply(parameterName: Identifier, typeAnnotation: TSTypeAnnotation, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisType): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation, asserts: Boolean): TSTypePredicate = js.native
}

