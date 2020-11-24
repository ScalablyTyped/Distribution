package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimiter extends js.Object {
  
  /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
  var bounceBack: js.UndefOr[Boolean] = js.native
  
  /** Per duration in milliseconds */
  var duration: Double = js.native
  
  /** Groups jobs with the specified key from the data object passed to the Queue#add ex. "network.handle" */
  var groupKey: js.UndefOr[String] = js.native
  
  /** Max numbers of jobs processed */
  var max: Double = js.native
}
object RateLimiter {
  
  @scala.inline
  def apply(duration: Double, max: Double): RateLimiter = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimiter]
  }
  
  @scala.inline
  implicit class RateLimiterOps[Self <: RateLimiter] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceBack(value: Boolean): Self = this.set("bounceBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceBack: Self = this.set("bounceBack", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
  }
}
