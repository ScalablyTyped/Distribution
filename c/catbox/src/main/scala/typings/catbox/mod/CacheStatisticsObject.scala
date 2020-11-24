package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheStatisticsObject extends js.Object {
  
  /** errors - cache operations errors. TODO check this */
  var errors: Double = js.native
  
  /** generates - number of calls to the generate function. */
  var generates: Double = js.native
  
  /** gets - number of cache get() requests. */
  var gets: Double = js.native
  
  /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
  var hits: Double = js.native
  
  /** sets - number of cache writes. */
  var sets: Double = js.native
  
  /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
  var stales: Double = js.native
}
object CacheStatisticsObject {
  
  @scala.inline
  def apply(errors: Double, generates: Double, gets: Double, hits: Double, sets: Double, stales: Double): CacheStatisticsObject = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], generates = generates.asInstanceOf[js.Any], gets = gets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any], stales = stales.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStatisticsObject]
  }
  
  @scala.inline
  implicit class CacheStatisticsObjectOps[Self <: CacheStatisticsObject] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerates(value: Double): Self = this.set("generates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGets(value: Double): Self = this.set("gets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSets(value: Double): Self = this.set("sets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStales(value: Double): Self = this.set("stales", value.asInstanceOf[js.Any])
  }
}
