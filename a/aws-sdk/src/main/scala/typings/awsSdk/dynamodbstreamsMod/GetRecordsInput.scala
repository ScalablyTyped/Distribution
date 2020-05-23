package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsInput extends js.Object {
  /**
    * The maximum number of records to return from the shard. The upper limit is 1000.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to access the stream records in this shard.
    */
  var ShardIterator: typings.awsSdk.dynamodbstreamsMod.ShardIterator = js.native
}

object GetRecordsInput {
  @scala.inline
  def apply(ShardIterator: ShardIterator, Limit: js.UndefOr[PositiveIntegerObject] = js.undefined): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsInput]
  }
}

