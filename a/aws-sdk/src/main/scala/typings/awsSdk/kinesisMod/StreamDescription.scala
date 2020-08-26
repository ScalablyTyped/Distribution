package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescription extends js.Object {
  /**
    * The server-side encryption type used on the stream. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList = js.native
  /**
    * If set to true, more shards in the stream are available to describe.
    */
  var HasMoreShards: BooleanObject = js.native
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[typings.awsSdk.kinesisMod.KeyId] = js.native
  /**
    * The current retention period, in hours.
    */
  var RetentionPeriodHours: typings.awsSdk.kinesisMod.RetentionPeriodHours = js.native
  /**
    * The shards that comprise the stream.
    */
  var Shards: ShardList = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: typings.awsSdk.kinesisMod.StreamARN = js.native
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: Timestamp = js.native
  /**
    * The name of the stream being described.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: typings.awsSdk.kinesisMod.StreamStatus = js.native
}

object StreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: EnhancedMonitoringList,
    HasMoreShards: BooleanObject,
    RetentionPeriodHours: RetentionPeriodHours,
    Shards: ShardList,
    StreamARN: StreamARN,
    StreamCreationTimestamp: Timestamp,
    StreamName: StreamName,
    StreamStatus: StreamStatus
  ): StreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescription]
  }
  @scala.inline
  implicit class StreamDescriptionOps[Self <: StreamDescription] (val x: Self) extends AnyVal {
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
    def setEnhancedMonitoringVarargs(value: EnhancedMetrics*): Self = this.set("EnhancedMonitoring", js.Array(value :_*))
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoringList): Self = this.set("EnhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMoreShards(value: BooleanObject): Self = this.set("HasMoreShards", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPeriodHours(value: RetentionPeriodHours): Self = this.set("RetentionPeriodHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardsVarargs(value: Shard*): Self = this.set("Shards", js.Array(value :_*))
    @scala.inline
    def setShards(value: ShardList): Self = this.set("Shards", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamARN(value: StreamARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamCreationTimestamp(value: Timestamp): Self = this.set("StreamCreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamStatus(value: StreamStatus): Self = this.set("StreamStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    @scala.inline
    def setKeyId(value: KeyId): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
  
}

