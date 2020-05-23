package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamInput extends js.Object {
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typings.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}

object DescribeStreamInput {
  @scala.inline
  def apply(
    StreamArn: StreamArn,
    ExclusiveStartShardId: ShardId = null,
    Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  ): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    if (ExclusiveStartShardId != null) __obj.updateDynamic("ExclusiveStartShardId")(ExclusiveStartShardId.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
}

