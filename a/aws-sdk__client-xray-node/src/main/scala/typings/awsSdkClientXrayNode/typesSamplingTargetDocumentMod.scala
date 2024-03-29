package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingTargetDocumentMod {
  
  trait SamplingTargetDocument extends StObject {
    
    /**
      * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
      */
    var FixedRate: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The number of seconds for the service to wait before getting sampling targets again.</p>
      */
    var Interval: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The number of requests per second that X-Ray allocated this service.</p>
      */
    var ReservoirQuota: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>When the reservoir quota expires.</p>
      */
    var ReservoirQuotaTTL: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  object SamplingTargetDocument {
    
    inline def apply(): SamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingTargetDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SamplingTargetDocument] (val x: Self) extends AnyVal {
      
      inline def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
      
      inline def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
      
      inline def setReservoirQuota(value: Double): Self = StObject.set(x, "ReservoirQuota", value.asInstanceOf[js.Any])
      
      inline def setReservoirQuotaTTL(value: js.Date | String | Double): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      inline def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
      
      inline def setReservoirQuotaUndefined: Self = StObject.set(x, "ReservoirQuota", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    }
  }
  
  trait UnmarshalledSamplingTargetDocument
    extends StObject
       with SamplingTargetDocument {
    
    /**
      * <p>When the reservoir quota expires.</p>
      */
    @JSName("ReservoirQuotaTTL")
    var ReservoirQuotaTTL_UnmarshalledSamplingTargetDocument: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledSamplingTargetDocument {
    
    inline def apply(): UnmarshalledSamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingTargetDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledSamplingTargetDocument] (val x: Self) extends AnyVal {
      
      inline def setReservoirQuotaTTL(value: js.Date): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      inline def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
    }
  }
}
