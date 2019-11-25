package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSIndexSignature
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier]
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSIndexSignature: typings.atBabelTypes.atBabelTypesStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    parameters: js.Array[Identifier],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSIndexSignature,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexSignature]
  }
}

@JSImport("@babel/types", "tsIndexSignature")
@js.native
object tsIndexSignature extends js.Object {
  def apply(parameters: js.Array[Identifier]): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier], typeAnnotation: Null, readonly: Boolean): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation, readonly: Boolean): TSIndexSignature = js.native
}

