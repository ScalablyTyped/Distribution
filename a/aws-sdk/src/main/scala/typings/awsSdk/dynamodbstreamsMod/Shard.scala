package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The shard ID of the current shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.SequenceNumberRange] = js.native
  /**
    * The system-generated identifier for this shard.
    */
  var ShardId: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.ShardId] = js.native
}

object Shard {
  @scala.inline
  def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
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
    def setParentShardId(value: ShardId): Self = this.set("ParentShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentShardId: Self = this.set("ParentShardId", js.undefined)
    @scala.inline
    def setSequenceNumberRange(value: SequenceNumberRange): Self = this.set("SequenceNumberRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceNumberRange: Self = this.set("SequenceNumberRange", js.undefined)
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardId: Self = this.set("ShardId", js.undefined)
  }
  
}

