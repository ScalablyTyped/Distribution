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

