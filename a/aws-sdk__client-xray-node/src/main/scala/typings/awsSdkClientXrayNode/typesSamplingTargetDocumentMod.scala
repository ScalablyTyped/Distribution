package typings.awsSdkClientXrayNode

import typings.std.Date
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
    var ReservoirQuotaTTL: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
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
      def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
      
      @scala.inline
      def setReservoirQuota(value: Double): Self = StObject.set(x, "ReservoirQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTL(value: Date | String | Double): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
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
  
  trait UnmarshalledSamplingTargetDocument
    extends StObject
       with SamplingTargetDocument {
    
    /**
      * <p>When the reservoir quota expires.</p>
      */
    @JSName("ReservoirQuotaTTL")
    var ReservoirQuotaTTL_UnmarshalledSamplingTargetDocument: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledSamplingTargetDocument {
    
    @scala.inline
    def apply(): UnmarshalledSamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingTargetDocument]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingTargetDocumentMutableBuilder[Self <: UnmarshalledSamplingTargetDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReservoirQuotaTTL(value: Date): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
    }
  }
}
