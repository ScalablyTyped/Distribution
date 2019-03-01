package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGetCachedOptions[T] extends js.Object {
  /** isStale - true if the item is stale. */
  var isStale: scala.Boolean
  /** item - the cached value. */
  var item: T
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: scala.Double
  /** ttl - the cache ttl value for the record. */
  var ttl: scala.Double
}

object PolicyGetCachedOptions {
  @scala.inline
  def apply[T](isStale: scala.Boolean, item: T, stored: scala.Double, ttl: scala.Double): PolicyGetCachedOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isStale")(isStale)
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("stored")(stored)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[PolicyGetCachedOptions[T]]
  }
}

