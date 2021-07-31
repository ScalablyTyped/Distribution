package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFaultStatisticsMod {
  
  trait FaultStatistics extends StObject {
    
    /**
      * <p>The number of requests that failed with untracked 5xx Server Error status codes.</p>
      */
    var OtherCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The total number of requests that failed with a 5xx Server Error status code.</p>
      */
    var TotalCount: js.UndefOr[Double] = js.undefined
  }
  object FaultStatistics {
    
    @scala.inline
    def apply(): FaultStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaultStatistics]
    }
    
    @scala.inline
    implicit class FaultStatisticsMutableBuilder[Self <: FaultStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOtherCount(value: Double): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    }
  }
  
  type UnmarshalledFaultStatistics = FaultStatistics
}
