package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescription extends js.Object {
  /**
    * The date and time when the request to create this stream was issued.
    */
  var CreationRequestDateTime: js.UndefOr[Date] = js.native
  /**
    * The key attribute(s) of the stream's DynamoDB table.
    */
  var KeySchema: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.KeySchema] = js.native
  /**
    * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedShardId is empty, then the "last page" of results has been processed and there is currently no more data to be retrieved. If LastEvaluatedShardId is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedShardId is empty.
    */
  var LastEvaluatedShardId: js.UndefOr[ShardId] = js.native
  /**
    * The shards that comprise the stream.
    */
  var Shards: js.UndefOr[ShardDescriptionList] = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.native
  /**
    * Indicates the current status of the stream:    ENABLING - Streams is currently being enabled on the DynamoDB table.    ENABLED - the stream is enabled.    DISABLING - Streams is currently being disabled on the DynamoDB table.    DISABLED - the stream is disabled.  
    */
  var StreamStatus: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamStatus] = js.native
  /**
    * Indicates the format of the records within this stream:    KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.    NEW_IMAGE - entire items from the table, as they appeared after they were modified.    OLD_IMAGE - entire items from the table, as they appeared before they were modified.    NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamViewType] = js.native
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.TableName] = js.native
}

object StreamDescription {
  @scala.inline
  def apply(
    CreationRequestDateTime: Date = null,
    KeySchema: KeySchema = null,
    LastEvaluatedShardId: ShardId = null,
    Shards: ShardDescriptionList = null,
    StreamArn: StreamArn = null,
    StreamLabel: String = null,
    StreamStatus: StreamStatus = null,
    StreamViewType: StreamViewType = null,
    TableName: TableName = null
  ): StreamDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationRequestDateTime != null) __obj.updateDynamic("CreationRequestDateTime")(CreationRequestDateTime.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (LastEvaluatedShardId != null) __obj.updateDynamic("LastEvaluatedShardId")(LastEvaluatedShardId.asInstanceOf[js.Any])
    if (Shards != null) __obj.updateDynamic("Shards")(Shards.asInstanceOf[js.Any])
    if (StreamArn != null) __obj.updateDynamic("StreamArn")(StreamArn.asInstanceOf[js.Any])
    if (StreamLabel != null) __obj.updateDynamic("StreamLabel")(StreamLabel.asInstanceOf[js.Any])
    if (StreamStatus != null) __obj.updateDynamic("StreamStatus")(StreamStatus.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescription]
  }
}

