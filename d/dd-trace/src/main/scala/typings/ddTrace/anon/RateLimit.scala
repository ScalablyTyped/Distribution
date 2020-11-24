package typings.ddTrace.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimit extends js.Object {
  
  /**
    * Controls the ingestion rate limit between the agent and the backend.
    */
  var rateLimit: js.UndefOr[Double] = js.native
  
  /**
    * Controls the ingestion sample rate (between 0 and 1) between the agent and the backend.
    */
  var sampleRate: js.UndefOr[Double] = js.native
}
object RateLimit {
  
  @scala.inline
  def apply(): RateLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateLimit]
  }
  
  @scala.inline
  implicit class RateLimitOps[Self <: RateLimit] (val x: Self) extends AnyVal {
    
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
    def setRateLimit(value: Double): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
}
