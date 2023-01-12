package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorStatisticsMod {
  
  trait ErrorStatistics extends StObject {
    
    /**
      * <p>The number of requests that failed with untracked 4xx Client Error status codes.</p>
      */
    var OtherCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The number of requests that failed with a 419 throttling status code.</p>
      */
    var ThrottleCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The total number of requests that failed with a 4xx Client Error status code.</p>
      */
    var TotalCount: js.UndefOr[Double] = js.undefined
  }
  object ErrorStatistics {
    
    inline def apply(): ErrorStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorStatistics] (val x: Self) extends AnyVal {
      
      inline def setOtherCount(value: Double): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
      
      inline def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
      
      inline def setThrottleCount(value: Double): Self = StObject.set(x, "ThrottleCount", value.asInstanceOf[js.Any])
      
      inline def setThrottleCountUndefined: Self = StObject.set(x, "ThrottleCount", js.undefined)
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
      
      inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    }
  }
  
  type UnmarshalledErrorStatistics = ErrorStatistics
}
