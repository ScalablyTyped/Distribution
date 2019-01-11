package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeAnnotation extends BaseNode {
  var callProperties: js.Array[ObjectTypeCallProperty] | scala.Null
  var exact: scala.Boolean
  var indexers: js.Array[ObjectTypeIndexer] | scala.Null
  var inexact: scala.Boolean | scala.Null
  var internalSlots: js.Array[ObjectTypeInternalSlot] | scala.Null
  var properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty]
  @JSName("type")
  var type_ObjectTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeAnnotation
}

