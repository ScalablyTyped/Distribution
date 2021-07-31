package typings.awsSdkClientXrayNode

import typings.std.Date
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
    var Timestamp: Date | String | Double
  }
  object SamplingStatisticsDocument {
    
    @scala.inline
    def apply(
      ClientID: String,
      RequestCount: Double,
      RuleName: String,
      SampledCount: Double,
      Timestamp: Date | String | Double
    ): SamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit class SamplingStatisticsDocumentMutableBuilder[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorrowCount(value: Double): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCount(value: Double): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledCount(value: Double): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSamplingStatisticsDocument
    extends StObject
       with SamplingStatisticsDocument {
    
    /**
      * <p>The current time.</p>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledSamplingStatisticsDocument: Date
  }
  object UnmarshalledSamplingStatisticsDocument {
    
    @scala.inline
    def apply(ClientID: String, RequestCount: Double, RuleName: String, SampledCount: Double, Timestamp: Date): UnmarshalledSamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingStatisticsDocumentMutableBuilder[Self <: UnmarshalledSamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
