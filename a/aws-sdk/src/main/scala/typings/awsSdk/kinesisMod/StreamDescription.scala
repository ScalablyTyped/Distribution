package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamDescription extends StObject {
  
  /**
    * The server-side encryption type used on the stream. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.undefined
  
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList
  
  /**
    * If set to true, more shards in the stream are available to describe.
    */
  var HasMoreShards: BooleanObject
  
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[typings.awsSdk.kinesisMod.KeyId] = js.undefined
  
  /**
    * The current retention period, in hours. Minimum value of 24. Maximum value of 168.
    */
  var RetentionPeriodHours: typings.awsSdk.kinesisMod.RetentionPeriodHours
  
  /**
    * The shards that comprise the stream.
    */
  var Shards: ShardList
  
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: typings.awsSdk.kinesisMod.StreamARN
  
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: Timestamp
  
  /**
    * The name of the stream being described.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
  
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: typings.awsSdk.kinesisMod.StreamStatus
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
  implicit class StreamDescriptionMutableBuilder[Self <: StreamDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoringList): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoringVarargs(value: EnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value :_*))
    
    @scala.inline
    def setHasMoreShards(value: BooleanObject): Self = StObject.set(x, "HasMoreShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShards(value: ShardList): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsVarargs(value: Shard*): Self = StObject.set(x, "Shards", js.Array(value :_*))
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamCreationTimestamp(value: Timestamp): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamStatus(value: StreamStatus): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
  }
}
