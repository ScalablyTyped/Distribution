package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeShardsInput extends js.Object {
  /**
    * The shard ID of the adjacent shard for the merge.
    */
  var AdjacentShardToMerge: ShardId = js.native
  /**
    * The shard ID of the shard to combine with the adjacent shard for the merge.
    */
  var ShardToMerge: ShardId = js.native
  /**
    * The name of the stream for the merge.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object MergeShardsInput {
  @scala.inline
  def apply(AdjacentShardToMerge: ShardId, ShardToMerge: ShardId, StreamName: StreamName): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeShardsInput]
  }
}

