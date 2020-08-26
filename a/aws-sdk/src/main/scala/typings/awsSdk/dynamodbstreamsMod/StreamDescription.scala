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
  def apply(): StreamDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamDescription]
  }
  @scala.inline
  implicit class StreamDescriptionOps[Self <: StreamDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationRequestDateTime(value: Date): Self = this.set("CreationRequestDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationRequestDateTime: Self = this.set("CreationRequestDateTime", js.undefined)
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: KeySchema): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    @scala.inline
    def setLastEvaluatedShardId(value: ShardId): Self = this.set("LastEvaluatedShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEvaluatedShardId: Self = this.set("LastEvaluatedShardId", js.undefined)
    @scala.inline
    def setShardsVarargs(value: Shard*): Self = this.set("Shards", js.Array(value :_*))
    @scala.inline
    def setShards(value: ShardDescriptionList): Self = this.set("Shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShards: Self = this.set("Shards", js.undefined)
    @scala.inline
    def setStreamArn(value: StreamArn): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamArn: Self = this.set("StreamArn", js.undefined)
    @scala.inline
    def setStreamLabel(value: String): Self = this.set("StreamLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamLabel: Self = this.set("StreamLabel", js.undefined)
    @scala.inline
    def setStreamStatus(value: StreamStatus): Self = this.set("StreamStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamStatus: Self = this.set("StreamStatus", js.undefined)
    @scala.inline
    def setStreamViewType(value: StreamViewType): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

