package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGetCachedOptions[T] extends js.Object {
  /** isStale - true if the item is stale. */
  var isStale: Boolean
  /** item - the cached value. */
  var item: T
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double
  /** ttl - the cache ttl value for the record. */
  var ttl: Double
}

object PolicyGetCachedOptions {
  @scala.inline
  def apply[T](isStale: Boolean, item: T, stored: Double, ttl: Double): PolicyGetCachedOptions[T] = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyGetCachedOptions[T]]
  }
}

