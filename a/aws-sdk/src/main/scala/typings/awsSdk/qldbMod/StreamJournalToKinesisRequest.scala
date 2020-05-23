package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamJournalToKinesisRequest extends js.Object {
  /**
    * The exclusive date and time that specifies when the stream ends. If you keep this parameter blank, the stream runs indefinitely until you cancel it. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z 
    */
  var ExclusiveEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The inclusive start date and time from which to start streaming journal data. This parameter must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The InclusiveStartTime cannot be in the future and must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, QLDB effectively defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: Timestamp = js.native
  /**
    * The configuration settings of the Kinesis Data Streams destination for your stream request.
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
    * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream. Your stream name must be unique among other active streams for a given ledger. If you try to create a stream with the same name and configuration of an active, existing stream for the same ledger, QLDB simply returns the existing stream. Stream names have the same naming constraints as ledger names, as defined in Quotas in Amazon QLDB in the Amazon QLDB Developer Guide.
    */
  var StreamName: typings.awsSdk.qldbMod.StreamName = js.native
  /**
    * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typings.awsSdk.qldbMod.Tags] = js.native
}

object StreamJournalToKinesisRequest {
  @scala.inline
  def apply(
    InclusiveStartTime: Timestamp,
    KinesisConfiguration: KinesisConfiguration,
    LedgerName: LedgerName,
    RoleArn: Arn,
    StreamName: StreamName,
    ExclusiveEndTime: Timestamp = null,
    Tags: Tags = null
  ): StreamJournalToKinesisRequest = {
    val __obj = js.Dynamic.literal(InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], KinesisConfiguration = KinesisConfiguration.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    if (ExclusiveEndTime != null) __obj.updateDynamic("ExclusiveEndTime")(ExclusiveEndTime.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamJournalToKinesisRequest]
  }
}

