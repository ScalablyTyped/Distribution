package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceStatisticsMod {
  
  trait ServiceStatistics extends StObject {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    var ErrorStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.undefined
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    var FaultStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.undefined
    
    /**
      * <p>The number of requests that completed with a 2xx Success status code.</p>
      */
    var OkCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The total number of completed requests.</p>
      */
    var TotalCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The aggregate response time of completed requests.</p>
      */
    var TotalResponseTime: js.UndefOr[Double] = js.undefined
  }
  object ServiceStatistics {
    
    inline def apply(): ServiceStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceStatistics] (val x: Self) extends AnyVal {
      
      inline def setErrorStatistics(value: ErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      inline def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      inline def setFaultStatistics(value: FaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      inline def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
      
      inline def setOkCount(value: Double): Self = StObject.set(x, "OkCount", value.asInstanceOf[js.Any])
      
      inline def setOkCountUndefined: Self = StObject.set(x, "OkCount", js.undefined)
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
      
      inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
      
      inline def setTotalResponseTime(value: Double): Self = StObject.set(x, "TotalResponseTime", value.asInstanceOf[js.Any])
      
      inline def setTotalResponseTimeUndefined: Self = StObject.set(x, "TotalResponseTime", js.undefined)
    }
  }
  
  trait UnmarshalledServiceStatistics
    extends StObject
       with ServiceStatistics {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    @JSName("ErrorStatistics")
    var ErrorStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.undefined
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    @JSName("FaultStatistics")
    var FaultStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.undefined
  }
  object UnmarshalledServiceStatistics {
    
    inline def apply(): UnmarshalledServiceStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledServiceStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledServiceStatistics] (val x: Self) extends AnyVal {
      
      inline def setErrorStatistics(value: UnmarshalledErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      inline def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      inline def setFaultStatistics(value: UnmarshalledFaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      inline def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
    }
  }
}
