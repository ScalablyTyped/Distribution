package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamJournalToKinesisRequest extends StObject {
  
  /**
    * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream runs indefinitely until you cancel it. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z.
    */
  var ExclusiveEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The inclusive start date and time from which to start streaming journal data. This parameter must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z. The InclusiveStartTime cannot be in the future and must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, QLDB effectively defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: js.Date
  
  /**
    * The configuration settings of the Kinesis Data Streams destination for your stream request.
    */
  var KinesisConfiguration: typings.awsSdk.qldbMod.KinesisConfiguration
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource. To pass a role to QLDB when requesting a journal stream, you must have permissions to perform the iam:PassRole action on the IAM role resource. This is required for all journal stream requests.
    */
  var RoleArn: Arn
  
  /**
    * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream. Your stream name must be unique among other active streams for a given ledger. Stream names have the same naming constraints as ledger names, as defined in Quotas in Amazon QLDB in the Amazon QLDB Developer Guide.
    */
  var StreamName: typings.awsSdk.qldbMod.StreamName
  
  /**
    * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typings.awsSdk.qldbMod.Tags] = js.undefined
}
object StreamJournalToKinesisRequest {
  
  inline def apply(
    InclusiveStartTime: js.Date,
    KinesisConfiguration: KinesisConfiguration,
    LedgerName: LedgerName,
    RoleArn: Arn,
    StreamName: StreamName
  ): StreamJournalToKinesisRequest = {
    val __obj = js.Dynamic.literal(InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], KinesisConfiguration = KinesisConfiguration.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamJournalToKinesisRequest]
  }
  
  extension [Self <: StreamJournalToKinesisRequest](x: Self) {
    
    inline def setExclusiveEndTime(value: js.Date): Self = StObject.set(x, "ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    inline def setExclusiveEndTimeUndefined: Self = StObject.set(x, "ExclusiveEndTime", js.undefined)
    
    inline def setInclusiveStartTime(value: js.Date): Self = StObject.set(x, "InclusiveStartTime", value.asInstanceOf[js.Any])
    
    inline def setKinesisConfiguration(value: KinesisConfiguration): Self = StObject.set(x, "KinesisConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
