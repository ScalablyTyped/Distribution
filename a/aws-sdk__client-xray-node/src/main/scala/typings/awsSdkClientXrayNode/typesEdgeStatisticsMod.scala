package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEdgeStatisticsMod {
  
  @js.native
  trait EdgeStatistics extends StObject {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    var ErrorStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.native
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    var FaultStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.native
    
    /**
      * <p>The number of requests that completed with a 2xx Success status code.</p>
      */
    var OkCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The total number of completed requests.</p>
      */
    var TotalCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The aggregate response time of completed requests.</p>
      */
    var TotalResponseTime: js.UndefOr[Double] = js.native
  }
  object EdgeStatistics {
    
    @scala.inline
    def apply(): EdgeStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeStatistics]
    }
    
    @scala.inline
    implicit class EdgeStatisticsMutableBuilder[Self <: EdgeStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorStatistics(value: ErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      @scala.inline
      def setFaultStatistics(value: FaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
      
      @scala.inline
      def setOkCount(value: Double): Self = StObject.set(x, "OkCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkCountUndefined: Self = StObject.set(x, "OkCount", js.undefined)
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
      
      @scala.inline
      def setTotalResponseTime(value: Double): Self = StObject.set(x, "TotalResponseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalResponseTimeUndefined: Self = StObject.set(x, "TotalResponseTime", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEdgeStatistics extends EdgeStatistics {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    @JSName("ErrorStatistics")
    var ErrorStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.native
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    @JSName("FaultStatistics")
    var FaultStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.native
  }
  object UnmarshalledEdgeStatistics {
    
    @scala.inline
    def apply(): UnmarshalledEdgeStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEdgeStatistics]
    }
    
    @scala.inline
    implicit class UnmarshalledEdgeStatisticsMutableBuilder[Self <: UnmarshalledEdgeStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorStatistics(value: UnmarshalledErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      @scala.inline
      def setFaultStatistics(value: UnmarshalledFaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
    }
  }
}
