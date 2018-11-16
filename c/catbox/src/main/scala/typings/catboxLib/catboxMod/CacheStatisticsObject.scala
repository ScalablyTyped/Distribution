package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CacheStatisticsObject extends js.Object {
  /** errors - cache operations errors. TODO check this */
  var errors: scala.Double
  /** generates - number of calls to the generate function. */
  var generates: scala.Double
  /** gets - number of cache get() requests. */
  var gets: scala.Double
  /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
  var hits: scala.Double
  /** sets - number of cache writes. */
  var sets: scala.Double
  /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
  var stales: scala.Double
}

