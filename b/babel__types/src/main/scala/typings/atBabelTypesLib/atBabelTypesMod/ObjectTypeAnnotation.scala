package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var callProperties: js.Array[ObjectTypeCallProperty] | scala.Null
  var exact: scala.Boolean
  var indexers: js.Array[ObjectTypeIndexer] | scala.Null
  var inexact: scala.Boolean | scala.Null
  var internalSlots: js.Array[ObjectTypeInternalSlot] | scala.Null
  var properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty]
  @JSName("type")
  var type_ObjectTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    exact: scala.Boolean,
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeAnnotation,
    callProperties: js.Array[ObjectTypeCallProperty] = null,
    end: scala.Int | scala.Double = null,
    indexers: js.Array[ObjectTypeIndexer] = null,
    inexact: js.UndefOr[scala.Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    internalSlots: js.Array[ObjectTypeInternalSlot] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(exact = exact, properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (callProperties != null) __obj.updateDynamic("callProperties")(callProperties)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (indexers != null) __obj.updateDynamic("indexers")(indexers)
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (internalSlots != null) __obj.updateDynamic("internalSlots")(internalSlots)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

