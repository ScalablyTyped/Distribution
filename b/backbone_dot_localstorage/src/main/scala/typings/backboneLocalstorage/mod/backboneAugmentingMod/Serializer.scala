package typings.backboneLocalstorage.mod.backboneAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(data: js.Any): js.Any
  def serialize(item: js.Any): js.Any
}

object Serializer {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Serializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Serializer]
  }
}

