package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingStatisticsDocumentMod {
  
  trait SamplingStatisticsDocument extends StObject {
    
    /**
      * <p>The number of requests recorded with borrowed reservoir quota.</p>
      */
    var BorrowCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A unique identifier for the service in hexadecimal.</p>
      */
    var ClientID: String
    
    /**
      * <p>The number of requests that matched the rule.</p>
      */
    var RequestCount: Double
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: String
    
    /**
      * <p>The number of requests recorded.</p>
      */
    var SampledCount: Double
    
    /**
      * <p>The current time.</p>
      */
    var Timestamp: js.Date | String | Double
  }
  object SamplingStatisticsDocument {
    
    inline def apply(
      ClientID: String,
      RequestCount: Double,
      RuleName: String,
      SampledCount: Double,
      Timestamp: js.Date | String | Double
    ): SamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      inline def setBorrowCount(value: Double): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
      
      inline def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
      
      inline def setRequestCount(value: Double): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      inline def setSampledCount(value: Double): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSamplingStatisticsDocument
    extends StObject
       with SamplingStatisticsDocument {
    
    /**
      * <p>The current time.</p>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledSamplingStatisticsDocument: js.Date
  }
  object UnmarshalledSamplingStatisticsDocument {
    
    inline def apply(ClientID: String, RequestCount: Double, RuleName: String, SampledCount: Double, Timestamp: js.Date): UnmarshalledSamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledSamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
