package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JournalKinesisStreamDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the QLDB journal stream.
    */
  var Arn: js.UndefOr[typings.awsSdk.qldbMod.Arn] = js.native
  
  /**
    * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The error message that describes the reason that a stream has a status of IMPAIRED or FAILED. This is not applicable to streams that have other status values.
    */
  var ErrorCause: js.UndefOr[typings.awsSdk.qldbMod.ErrorCause] = js.native
  
  /**
    * The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream runs indefinitely until you cancel it.
    */
  var ExclusiveEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The inclusive start date and time from which to start streaming journal data.
    */
  var InclusiveStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
    */
  var KinesisConfiguration: typings.awsSdk.qldbMod.KinesisConfiguration = js.native
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.
    */
  var RoleArn: Arn = js.native
  
  /**
    * The current state of the QLDB journal stream.
    */
  var Status: StreamStatus = js.native
  
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: UniqueId = js.native
  
  /**
    * The user-defined name of the QLDB journal stream.
    */
  var StreamName: typings.awsSdk.qldbMod.StreamName = js.native
}
object JournalKinesisStreamDescription {
  
  @scala.inline
  def apply(
    KinesisConfiguration: KinesisConfiguration,
    LedgerName: LedgerName,
    RoleArn: Arn,
    Status: StreamStatus,
    StreamId: UniqueId,
    StreamName: StreamName
  ): JournalKinesisStreamDescription = {
    val __obj = js.Dynamic.literal(KinesisConfiguration = KinesisConfiguration.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalKinesisStreamDescription]
  }
  
  @scala.inline
  implicit class JournalKinesisStreamDescriptionMutableBuilder[Self <: JournalKinesisStreamDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setErrorCause(value: ErrorCause): Self = StObject.set(x, "ErrorCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCauseUndefined: Self = StObject.set(x, "ErrorCause", js.undefined)
    
    @scala.inline
    def setExclusiveEndTime(value: Timestamp): Self = StObject.set(x, "ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveEndTimeUndefined: Self = StObject.set(x, "ExclusiveEndTime", js.undefined)
    
    @scala.inline
    def setInclusiveStartTime(value: Timestamp): Self = StObject.set(x, "InclusiveStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusiveStartTimeUndefined: Self = StObject.set(x, "InclusiveStartTime", js.undefined)
    
    @scala.inline
    def setKinesisConfiguration(value: KinesisConfiguration): Self = StObject.set(x, "KinesisConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StreamStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
