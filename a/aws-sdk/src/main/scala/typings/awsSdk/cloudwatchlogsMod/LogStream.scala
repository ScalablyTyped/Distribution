package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogStream extends js.Object {
  
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
  implicit class LogStreamOps[Self <: LogStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setFirstEventTimestamp(value: Timestamp): Self = this.set("firstEventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstEventTimestamp: Self = this.set("firstEventTimestamp", js.undefined)
    
    @scala.inline
    def setLastEventTimestamp(value: Timestamp): Self = this.set("lastEventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEventTimestamp: Self = this.set("lastEventTimestamp", js.undefined)
    
    @scala.inline
    def setLastIngestionTime(value: Timestamp): Self = this.set("lastIngestionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIngestionTime: Self = this.set("lastIngestionTime", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
    
    @scala.inline
    def setStoredBytes(value: StoredBytes): Self = this.set("storedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoredBytes: Self = this.set("storedBytes", js.undefined)
    
    @scala.inline
    def setUploadSequenceToken(value: SequenceToken): Self = this.set("uploadSequenceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadSequenceToken: Self = this.set("uploadSequenceToken", js.undefined)
  }
}
