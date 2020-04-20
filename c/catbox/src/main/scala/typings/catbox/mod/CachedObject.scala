package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedObject[T] extends js.Object {
  /** item - the value stored in the cache using set(). */
  var item: T
  /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
  var stored: Double
  /** ttl - the remaining time-to-live (not the original value used when storing the object). */
  var ttl: Double
}

object CachedObject {
  @scala.inline
  def apply[T](item: T, stored: Double, ttl: Double): CachedObject[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedObject[T]]
  }
}

