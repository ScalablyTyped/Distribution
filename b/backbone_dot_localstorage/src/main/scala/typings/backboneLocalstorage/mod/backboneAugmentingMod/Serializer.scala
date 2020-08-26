package typings.backboneLocalstorage.mod.backboneAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  def deserialize(data: js.Any): js.Any = js.native
  def serialize(item: js.Any): js.Any = js.native
}

object Serializer {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Serializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Serializer]
  }
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeserialize(value: js.Any => js.Any): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = this.set("serialize", js.Any.fromFunction1(value))
  }
  
}

