package typings.blissfuljs

import typings.blissfuljs.BlissNS.BlissBindedArray
import typings.blissfuljs.BlissNS.BlissCollectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  @JSName("_")
  var _underscore: BlissBindedArray[T] with BlissCollectionArray[T] = js.native
}

object Array {
  @scala.inline
  def apply[T](_underscore: BlissBindedArray[T] with BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array[_], T] (val x: Self with Array[T]) extends AnyVal {
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
    def set_underscore(value: BlissBindedArray[T] with BlissCollectionArray[T]): Self = this.set("_", value.asInstanceOf[js.Any])
  }
  
}

