package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShardIteratorOutput extends js.Object {
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies this position using the sequence number of a stream record in a shard.
    */
  var ShardIterator: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.ShardIterator] = js.native
}

object GetShardIteratorOutput {
  @scala.inline
  def apply(ShardIterator: ShardIterator = null): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    if (ShardIterator != null) __obj.updateDynamic("ShardIterator")(ShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
}

