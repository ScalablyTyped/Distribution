package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSIndexSignature
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier]
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  @JSName("type")
  var type_TSIndexSignature: atBabelTypesLib.atBabelTypesLibStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    parameters: js.Array[Identifier],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSIndexSignature,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSIndexSignature]
  }
}

