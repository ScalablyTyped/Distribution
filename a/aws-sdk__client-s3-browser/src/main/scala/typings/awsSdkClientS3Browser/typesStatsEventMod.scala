package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesStatsMod.Stats
import typings.awsSdkClientS3Browser.typesStatsMod.UnmarshalledStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStatsEventMod {
  
  trait StatsEvent extends StObject {
    
    /**
      * <p>The Stats event details.</p>
      */
    var Details: js.UndefOr[Stats] = js.undefined
  }
  object StatsEvent {
    
    inline def apply(): StatsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsEvent] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: Stats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
  
  trait UnmarshalledStatsEvent
    extends StObject
       with StatsEvent {
    
    /**
      * <p>The Stats event details.</p>
      */
    @JSName("Details")
    var Details_UnmarshalledStatsEvent: js.UndefOr[UnmarshalledStats] = js.undefined
  }
  object UnmarshalledStatsEvent {
    
    inline def apply(): UnmarshalledStatsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledStatsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledStatsEvent] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: UnmarshalledStats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
}
