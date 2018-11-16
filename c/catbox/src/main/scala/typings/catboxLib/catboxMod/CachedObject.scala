package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CachedObject[T] extends js.Object {
  /** item - the value stored in the cache using set(). */
  var item: T
  /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
  var stored: scala.Double
  /** ttl - the remaining time-to-live (not the original value used when storing the object). */
  var ttl: scala.Double
}

