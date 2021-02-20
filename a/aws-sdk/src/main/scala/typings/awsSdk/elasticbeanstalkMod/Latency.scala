package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Latency extends StObject {
  
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
  implicit class LatencyMutableBuilder[Self <: Latency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP10(value: NullableDouble): Self = StObject.set(x, "P10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP10Undefined: Self = StObject.set(x, "P10", js.undefined)
    
    @scala.inline
    def setP50(value: NullableDouble): Self = StObject.set(x, "P50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP50Undefined: Self = StObject.set(x, "P50", js.undefined)
    
    @scala.inline
    def setP75(value: NullableDouble): Self = StObject.set(x, "P75", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP75Undefined: Self = StObject.set(x, "P75", js.undefined)
    
    @scala.inline
    def setP85(value: NullableDouble): Self = StObject.set(x, "P85", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP85Undefined: Self = StObject.set(x, "P85", js.undefined)
    
    @scala.inline
    def setP90(value: NullableDouble): Self = StObject.set(x, "P90", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP90Undefined: Self = StObject.set(x, "P90", js.undefined)
    
    @scala.inline
    def setP95(value: NullableDouble): Self = StObject.set(x, "P95", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP95Undefined: Self = StObject.set(x, "P95", js.undefined)
    
    @scala.inline
    def setP99(value: NullableDouble): Self = StObject.set(x, "P99", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP999(value: NullableDouble): Self = StObject.set(x, "P999", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP999Undefined: Self = StObject.set(x, "P999", js.undefined)
    
    @scala.inline
    def setP99Undefined: Self = StObject.set(x, "P99", js.undefined)
  }
}
