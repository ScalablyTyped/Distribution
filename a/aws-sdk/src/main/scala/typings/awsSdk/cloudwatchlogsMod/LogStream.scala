package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogStream extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the log stream.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var firstEventTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but in rare situations might take longer.
    */
  var lastEventTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastIngestionTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  
  /**
    * The number of bytes stored.  Important: On June 17, 2019, this parameter was deprecated for log streams, and is always reported as zero. This change applies only to log streams. The storedBytes parameter for log groups is not affected.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.native
  
  /**
    * The sequence token.
    */
  var uploadSequenceToken: js.UndefOr[SequenceToken] = js.native
}
object LogStream {
  
  @scala.inline
  def apply(): LogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogStream]
  }
  
  @scala.inline
  implicit class LogStreamMutableBuilder[Self <: LogStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setFirstEventTimestamp(value: Timestamp): Self = StObject.set(x, "firstEventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEventTimestampUndefined: Self = StObject.set(x, "firstEventTimestamp", js.undefined)
    
    @scala.inline
    def setLastEventTimestamp(value: Timestamp): Self = StObject.set(x, "lastEventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventTimestampUndefined: Self = StObject.set(x, "lastEventTimestamp", js.undefined)
    
    @scala.inline
    def setLastIngestionTime(value: Timestamp): Self = StObject.set(x, "lastIngestionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastIngestionTimeUndefined: Self = StObject.set(x, "lastIngestionTime", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    @scala.inline
    def setStoredBytes(value: StoredBytes): Self = StObject.set(x, "storedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredBytesUndefined: Self = StObject.set(x, "storedBytes", js.undefined)
    
    @scala.inline
    def setUploadSequenceToken(value: SequenceToken): Self = StObject.set(x, "uploadSequenceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSequenceTokenUndefined: Self = StObject.set(x, "uploadSequenceToken", js.undefined)
  }
}
