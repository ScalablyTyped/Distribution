package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "objectTypeAnnotation")
@js.native
object objectTypeAnnotation extends js.Object {
  def apply(): ObjectTypeAnnotation_ = js.native
  def apply(properties: js.Array[ObjectTypeProperty_]): ObjectTypeAnnotation_ = js.native
  def apply(properties: js.Array[ObjectTypeProperty_], indexers: js.Array[ObjectTypeIndexer_]): ObjectTypeAnnotation_ = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty_],
    indexers: js.Array[ObjectTypeIndexer_],
    callProperties: js.Array[ObjectTypeCallProperty_]
  ): ObjectTypeAnnotation_ = js.native
}

