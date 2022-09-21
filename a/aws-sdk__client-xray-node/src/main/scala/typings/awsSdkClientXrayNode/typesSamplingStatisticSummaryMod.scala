package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingStatisticSummaryMod {
  
  trait SamplingStatisticSummary extends StObject {
    
    /**
      * <p>The number of requests recorded with borrowed reservoir quota.</p>
      */
    var BorrowCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The number of requests that matched the rule.</p>
      */
    var RequestCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The number of requests recorded.</p>
      */
    var SampledCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The start time of the reporting window.</p>
      */
    var Timestamp: js.UndefOr[js.Date | String | Double] = js.undefined
  }
  object SamplingStatisticSummary {
    
    inline def apply(): SamplingStatisticSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingStatisticSummary]
    }
    
    extension [Self <: SamplingStatisticSummary](x: Self) {
      
      inline def setBorrowCount(value: Double): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
      
      inline def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
      
      inline def setRequestCount(value: Double): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
      
      inline def setRequestCountUndefined: Self = StObject.set(x, "RequestCount", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
      
      inline def setSampledCount(value: Double): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
      
      inline def setSampledCountUndefined: Self = StObject.set(x, "SampledCount", js.undefined)
      
      inline def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
  
  trait UnmarshalledSamplingStatisticSummary
    extends StObject
       with SamplingStatisticSummary {
    
    /**
      * <p>The start time of the reporting window.</p>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledSamplingStatisticSummary: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledSamplingStatisticSummary {
    
    inline def apply(): UnmarshalledSamplingStatisticSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
    }
    
    extension [Self <: UnmarshalledSamplingStatisticSummary](x: Self) {
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
}
