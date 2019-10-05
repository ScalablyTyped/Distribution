package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var callProperties: js.Array[ObjectTypeCallProperty] | Null
  var exact: Boolean
  var indexers: js.Array[ObjectTypeIndexer] | Null
  var inexact: Boolean | Null
  var internalSlots: js.Array[ObjectTypeInternalSlot] | Null
  var properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty]
  @JSName("type")
  var type_ObjectTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeAnnotation,
    callProperties: js.Array[ObjectTypeCallProperty] = null,
    end: Int | Double = null,
    indexers: js.Array[ObjectTypeIndexer] = null,
    inexact: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    internalSlots: js.Array[ObjectTypeInternalSlot] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
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

@JSImport("@babel/types", "objectTypeAnnotation")
@js.native
object objectTypeAnnotation extends js.Object {
  def apply(properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty]): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
}

