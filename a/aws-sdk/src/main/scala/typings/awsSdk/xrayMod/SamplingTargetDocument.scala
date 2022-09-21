package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingTargetDocument extends StObject {
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of requests per second that X-Ray allocated for this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}
object SamplingTargetDocument {
  
  inline def apply(): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingTargetDocument]
  }
  
  extension [Self <: SamplingTargetDocument](x: Self) {
    
    inline def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
    
    inline def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
    
    inline def setInterval(value: NullableInteger): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setReservoirQuota(value: NullableInteger): Self = StObject.set(x, "ReservoirQuota", value.asInstanceOf[js.Any])
    
    inline def setReservoirQuotaTTL(value: js.Date): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
    
    inline def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
    
    inline def setReservoirQuotaUndefined: Self = StObject.set(x, "ReservoirQuota", js.undefined)
    
    inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
  }
}
