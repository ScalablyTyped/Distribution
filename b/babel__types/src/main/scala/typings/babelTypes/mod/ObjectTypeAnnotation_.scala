package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var callProperties: js.Array[ObjectTypeCallProperty_] | Null
  var exact: Boolean
  var indexers: js.Array[ObjectTypeIndexer_] | Null
  var inexact: Boolean | Null
  var internalSlots: js.Array[ObjectTypeInternalSlot_] | Null
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation
}

object ObjectTypeAnnotation_ {
  @scala.inline
  def apply(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation,
    callProperties: js.Array[ObjectTypeCallProperty_] = null,
    end: Double = null.asInstanceOf[Double],
    indexers: js.Array[ObjectTypeIndexer_] = null,
    inexact: Boolean = null.asInstanceOf[Boolean],
    innerComments: js.Array[Comment] = null,
    internalSlots: js.Array[ObjectTypeInternalSlot_] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], inexact = inexact.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
}

