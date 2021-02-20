package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignLimitsMod {
  
  @js.native
  trait CampaignLimits extends StObject {
    
    /**
      * The maximum number of messages that each campaign can send to a single endpoint in a 24-hour period.
      */
    var Daily: js.UndefOr[Double] = js.native
    
    /**
      * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
      */
    var MaximumDuration: js.UndefOr[Double] = js.native
    
    /**
      * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
      */
    var MessagesPerSecond: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of messages that an individual campaign can send to a single endpoint over the course of the campaign.
      */
    var Total: js.UndefOr[Double] = js.native
  }
  object CampaignLimits {
    
    @scala.inline
    def apply(): CampaignLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignLimits]
    }
    
    @scala.inline
    implicit class CampaignLimitsMutableBuilder[Self <: CampaignLimits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaily(value: Double): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDailyUndefined: Self = StObject.set(x, "Daily", js.undefined)
      
      @scala.inline
      def setMaximumDuration(value: Double): Self = StObject.set(x, "MaximumDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDurationUndefined: Self = StObject.set(x, "MaximumDuration", js.undefined)
      
      @scala.inline
      def setMessagesPerSecond(value: Double): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    }
  }
  
  type UnmarshalledCampaignLimits = CampaignLimits
}
