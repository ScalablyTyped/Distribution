package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitShardInput extends js.Object {
  /**
    * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range for a given shard constitutes a set of ordered contiguous positive integers. The value for NewStartingHashKey must be in the range of hash keys being mapped into the shard. The NewStartingHashKey hash key value and all higher hash key values in hash key range are distributed to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
    */
  var NewStartingHashKey: HashKey = js.native
  /**
    * The shard ID of the shard to split.
    */
  var ShardToSplit: ShardId = js.native
  /**
    * The name of the stream for the shard split.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object SplitShardInput {
  @scala.inline
  def apply(NewStartingHashKey: HashKey, ShardToSplit: ShardId, StreamName: StreamName): SplitShardInput = {
    val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey.asInstanceOf[js.Any], ShardToSplit = ShardToSplit.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitShardInput]
  }
  @scala.inline
  implicit class SplitShardInputOps[Self <: SplitShardInput] (val x: Self) extends AnyVal {
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
    def setNewStartingHashKey(value: HashKey): Self = this.set("NewStartingHashKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardToSplit(value: ShardId): Self = this.set("ShardToSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
  }
  
}

