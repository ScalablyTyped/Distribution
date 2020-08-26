package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedObject[T] extends js.Object {
  /** item - the value stored in the cache using set(). */
  var item: T = js.native
  /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
  var stored: Double = js.native
  /** ttl - the remaining time-to-live (not the original value used when storing the object). */
  var ttl: Double = js.native
}

object CachedObject {
  @scala.inline
  def apply[T](item: T, stored: Double, ttl: Double): CachedObject[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedObject[T]]
  }
  @scala.inline
  implicit class CachedObjectOps[Self <: CachedObject[_], T] (val x: Self with CachedObject[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setStored(value: Double): Self = this.set("stored", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

