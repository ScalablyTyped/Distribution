package typings
package backboneDotLocalstorageLib.backboneDotLocalstorageMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(data: js.Any): js.Any
  def serialize(item: js.Any): js.Any
}

object Serializer {
  @scala.inline
  def apply(deserialize: js.Function1[js.Any, js.Any], serialize: js.Function1[js.Any, js.Any]): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deserialize")(deserialize)
    __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[Serializer]
  }
}

