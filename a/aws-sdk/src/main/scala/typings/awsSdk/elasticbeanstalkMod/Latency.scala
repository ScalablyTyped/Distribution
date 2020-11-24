package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Latency extends js.Object {
  
  /**
    * The average latency for the slowest 90 percent of requests over the last 10 seconds.
    */
  var P10: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 50 percent of requests over the last 10 seconds.
    */
  var P50: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 25 percent of requests over the last 10 seconds.
    */
  var P75: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 15 percent of requests over the last 10 seconds.
    */
  var P85: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 10 percent of requests over the last 10 seconds.
    */
  var P90: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 5 percent of requests over the last 10 seconds.
    */
  var P95: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 1 percent of requests over the last 10 seconds.
    */
  var P99: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
    */
  var P999: js.UndefOr[NullableDouble] = js.native
}
object Latency {
  
  @scala.inline
  def apply(): Latency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Latency]
  }
  
  @scala.inline
  implicit class LatencyOps[Self <: Latency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setP10(value: NullableDouble): Self = this.set("P10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP10: Self = this.set("P10", js.undefined)
    
    @scala.inline
    def setP50(value: NullableDouble): Self = this.set("P50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP50: Self = this.set("P50", js.undefined)
    
    @scala.inline
    def setP75(value: NullableDouble): Self = this.set("P75", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP75: Self = this.set("P75", js.undefined)
    
    @scala.inline
    def setP85(value: NullableDouble): Self = this.set("P85", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP85: Self = this.set("P85", js.undefined)
    
    @scala.inline
    def setP90(value: NullableDouble): Self = this.set("P90", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP90: Self = this.set("P90", js.undefined)
    
    @scala.inline
    def setP95(value: NullableDouble): Self = this.set("P95", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP95: Self = this.set("P95", js.undefined)
    
    @scala.inline
    def setP99(value: NullableDouble): Self = this.set("P99", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP99: Self = this.set("P99", js.undefined)
    
    @scala.inline
    def setP999(value: NullableDouble): Self = this.set("P999", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP999: Self = this.set("P999", js.undefined)
  }
}
