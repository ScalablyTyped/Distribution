package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingTargetDocument extends StObject {
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.native
  
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The number of requests per second that X-Ray allocated for this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.native
  
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
}
object SamplingTargetDocument {
  
  @scala.inline
  def apply(): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingTargetDocument]
  }
  
  @scala.inline
  implicit class SamplingTargetDocumentMutableBuilder[Self <: SamplingTargetDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
    
    @scala.inline
    def setInterval(value: NullableInteger): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setReservoirQuota(value: NullableInteger): Self = StObject.set(x, "ReservoirQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservoirQuotaTTL(value: Timestamp): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
    
    @scala.inline
    def setReservoirQuotaUndefined: Self = StObject.set(x, "ReservoirQuota", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
  }
}
