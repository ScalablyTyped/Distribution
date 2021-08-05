package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesContinuationEventMod.ContinuationEvent
import typings.awsSdkClientS3Browser.typesContinuationEventMod.UnmarshalledContinuationEvent
import typings.awsSdkClientS3Browser.typesEndEventMod.EndEvent
import typings.awsSdkClientS3Browser.typesEndEventMod.UnmarshalledEndEvent
import typings.awsSdkClientS3Browser.typesProgressEventMod.ProgressEvent
import typings.awsSdkClientS3Browser.typesProgressEventMod.UnmarshalledProgressEvent
import typings.awsSdkClientS3Browser.typesRecordsEventMod.RecordsEvent
import typings.awsSdkClientS3Browser.typesRecordsEventMod.UnmarshalledRecordsEvent
import typings.awsSdkClientS3Browser.typesStatsEventMod.StatsEvent
import typings.awsSdkClientS3Browser.typesStatsEventMod.UnmarshalledStatsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectObjectContentEventStreamMod {
  
  trait SelectObjectContentEventStream extends StObject {
    
    /**
      * <p>The Continuation Event.</p>
      */
    var Cont: js.UndefOr[ContinuationEvent] = js.undefined
    
    /**
      * <p>The End Event.</p>
      */
    var End: js.UndefOr[EndEvent] = js.undefined
    
    /**
      * <p>The Progress Event.</p>
      */
    var Progress: js.UndefOr[ProgressEvent] = js.undefined
    
    /**
      * <p>The Records Event.</p>
      */
    var Records: js.UndefOr[RecordsEvent] = js.undefined
    
    /**
      * <p>The Stats Event.</p>
      */
    var Stats: js.UndefOr[StatsEvent] = js.undefined
  }
  object SelectObjectContentEventStream {
    
    inline def apply(): SelectObjectContentEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectObjectContentEventStream]
    }
    
    extension [Self <: SelectObjectContentEventStream](x: Self) {
      
      inline def setCont(value: ContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
      
      inline def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
      
      inline def setEnd(value: EndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      inline def setProgress(value: ProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      inline def setRecords(value: RecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
      
      inline def setStats(value: StatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
    }
  }
  
  trait UnmarshalledSelectObjectContentEventStream
    extends StObject
       with SelectObjectContentEventStream {
    
    /**
      * <p>The Continuation Event.</p>
      */
    @JSName("Cont")
    var Cont_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledContinuationEvent] = js.undefined
    
    /**
      * <p>The End Event.</p>
      */
    @JSName("End")
    var End_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledEndEvent] = js.undefined
    
    /**
      * <p>The Progress Event.</p>
      */
    @JSName("Progress")
    var Progress_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledProgressEvent] = js.undefined
    
    /**
      * <p>The Records Event.</p>
      */
    @JSName("Records")
    var Records_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledRecordsEvent] = js.undefined
    
    /**
      * <p>The Stats Event.</p>
      */
    @JSName("Stats")
    var Stats_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledStatsEvent] = js.undefined
  }
  object UnmarshalledSelectObjectContentEventStream {
    
    inline def apply(): UnmarshalledSelectObjectContentEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSelectObjectContentEventStream]
    }
    
    extension [Self <: UnmarshalledSelectObjectContentEventStream](x: Self) {
      
      inline def setCont(value: UnmarshalledContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
      
      inline def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
      
      inline def setEnd(value: UnmarshalledEndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      inline def setProgress(value: UnmarshalledProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      inline def setRecords(value: UnmarshalledRecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
      
      inline def setStats(value: UnmarshalledStatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
    }
  }
}
