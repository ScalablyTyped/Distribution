package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStatisticsObject extends js.Object {
  /** errors - cache operations errors. TODO check this */
  var errors: Double
  /** generates - number of calls to the generate function. */
  var generates: Double
  /** gets - number of cache get() requests. */
  var gets: Double
  /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
  var hits: Double
  /** sets - number of cache writes. */
  var sets: Double
  /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
  var stales: Double
}

object CacheStatisticsObject {
  @scala.inline
  def apply(errors: Double, generates: Double, gets: Double, hits: Double, sets: Double, stales: Double): CacheStatisticsObject = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], generates = generates.asInstanceOf[js.Any], gets = gets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any], stales = stales.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheStatisticsObject]
  }
}

