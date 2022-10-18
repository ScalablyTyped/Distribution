package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAnalyticsJobSummary extends StObject {
  
  /**
    * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var CallAnalyticsJobName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobName] = js.undefined
  
  /**
    * Provides the status of your Call Analytics job. If the status is COMPLETED, the job is finished and you can find the results at the location specified in TranscriptFileUri (or RedactedTranscriptFileUri, if you requested transcript redaction). If the status is FAILED, FailureReason provides details on why your transcription job failed.
    */
  var CallAnalyticsJobStatus: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobStatus] = js.undefined
  
  /**
    * The date and time the specified Call Analytics job finished processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:33:13.922000-07:00 represents a transcription job that started processing at 12:33 PM UTC-7 on May 4, 2022.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time the specified Call Analytics job request was made. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If CallAnalyticsJobStatus is FAILED, FailureReason contains information about why the Call Analytics job failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code used to create your Call Analytics transcription.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time your Call Analytics job began processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.789000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object CallAnalyticsJobSummary {
  
  inline def apply(): CallAnalyticsJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAnalyticsJobSummary]
  }
  
  extension [Self <: CallAnalyticsJobSummary](x: Self) {
    
    inline def setCallAnalyticsJobName(value: CallAnalyticsJobName): Self = StObject.set(x, "CallAnalyticsJobName", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobNameUndefined: Self = StObject.set(x, "CallAnalyticsJobName", js.undefined)
    
    inline def setCallAnalyticsJobStatus(value: CallAnalyticsJobStatus): Self = StObject.set(x, "CallAnalyticsJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobStatusUndefined: Self = StObject.set(x, "CallAnalyticsJobStatus", js.undefined)
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
