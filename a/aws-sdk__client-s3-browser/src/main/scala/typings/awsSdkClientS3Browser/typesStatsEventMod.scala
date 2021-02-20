package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesStatsMod.Stats
import typings.awsSdkClientS3Browser.typesStatsMod.UnmarshalledStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStatsEventMod {
  
  @js.native
  trait StatsEvent extends StObject {
    
    /**
      * <p>The Stats event details.</p>
      */
    var Details: js.UndefOr[Stats] = js.native
  }
  object StatsEvent {
    
    @scala.inline
    def apply(): StatsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsEvent]
    }
    
    @scala.inline
    implicit class StatsEventMutableBuilder[Self <: StatsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: Stats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledStatsEvent extends StatsEvent {
    
    /**
      * <p>The Stats event details.</p>
      */
    @JSName("Details")
    var Details_UnmarshalledStatsEvent: js.UndefOr[UnmarshalledStats] = js.native
  }
  object UnmarshalledStatsEvent {
    
    @scala.inline
    def apply(): UnmarshalledStatsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledStatsEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledStatsEventMutableBuilder[Self <: UnmarshalledStatsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: UnmarshalledStats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
}
